import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExercise_04 {
   public static String dekriptuj(String ulaz) {
       Pattern regex = Pattern.compile("[starSTAR]");
       Matcher matcher = regex.matcher(ulaz);
       int brojac=0;
       while (matcher.find()){
           brojac++;
       }
       StringBuilder desifrovano=new StringBuilder();

       for (char karakter : ulaz.toCharArray()){
           char izmenjen=(char)((int) karakter - brojac);
           desifrovano.append(izmenjen);
       }
       return desifrovano.toString();
   }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        Pattern regex=Pattern
                .compile("^[^@\\-!:>]*@(?<nazivPlanete>[a-zA-Z]+)[^@\\-!:>]*:(?<populacija>\\d+)[^@\\-!:>]*!(?<vrstaNapada>[AD])![^@\\-!:>]*->(?<brojVojnika>\\d+)[^@\\-!:>]*$");

        ArrayList<String> napadnute=new ArrayList<>();
        ArrayList<String> unistene=new ArrayList<>();

        for (int i=1; i<=n; i++){
            String sifrovaniTekst=scanner.nextLine();
            String desifrovano=dekriptuj(sifrovaniTekst);

            Matcher matcher=regex.matcher(desifrovano);

            if (matcher.find()){
                String nazivPlanete= matcher.group("nazivPlanete");
                int populacija=Integer.parseInt(matcher.group("populacija"));
                String vrstaNapada= matcher.group("vrstaNapada");
                int brojVojnika=Integer.parseInt(matcher.group("brojVojnika"));

                if (vrstaNapada.equals("A")){
                    napadnute.add(nazivPlanete);
                }
                if (vrstaNapada.equals("D")){
                    unistene.add(nazivPlanete);
                }
            }
        }

        int brojNapadnutih=napadnute.size();
        int brojUnistenih=unistene.size();

        Collections.sort(napadnute);
        Collections.sort(unistene);

        System.out.printf("Attacked planets: %d\n", brojNapadnutih);
        napadnute.forEach(e-> System.out.println("-> " + e));
        System.out.printf("Destroyed planets: %d\n", brojUnistenih);
        unistene.forEach(e -> System.out.println("-> " + e));
    }
}
