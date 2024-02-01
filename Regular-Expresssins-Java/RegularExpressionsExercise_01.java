import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExercise_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Pattern regex=Pattern.compile(">>(?<nazivUredjaja>\\w+)<<(?<cena>[0-9\\.]+)!(?<kolicina>\\d+)");

        ArrayList<String> kupljenNamestaj=new ArrayList<>();
        double ukupnoPotroseno=0;


        while (true){
            String unos=scanner.nextLine();
            if (unos.equals("Purchase")) break;

            Matcher matcher = regex.matcher(unos);


            if (matcher.find()){
                String nazivUredjaja= matcher.group("nazivUredjaja");
                double cena=Double.parseDouble(matcher.group("cena"));
                int kolicina=Integer.parseInt(matcher.group("kolicina"));
                double totalCena= cena * kolicina;
                ukupnoPotroseno=ukupnoPotroseno + totalCena;
                kupljenNamestaj.add(nazivUredjaja);
            }
        }
        System.out.println("Bought furniture:");
        for (String namestaj : kupljenNamestaj){
            System.out.println(namestaj);
        }
        System.out.printf("Total money spend: %.2f", ukupnoPotroseno);
    }
}
