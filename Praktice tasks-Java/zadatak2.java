import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zadatak2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String unos=scanner.nextLine();
        Pattern regex=Pattern.compile("[#$%*&][\\w]+[#$%*&]=(<broj>[\\d]+)!!(<kod>[\\w\\d]+)");
        Matcher matcher=regex.matcher(unos);

        while (true) {
            if (matcher.find()) {
                int kod = Integer.parseInt(matcher.group("kod"));
                int broj = Integer.parseInt(matcher.group("broj"));
                if (kod == broj) {
                    StringBuilder sb = new StringBuilder(kod);
                    for (int i = 0; i < kod; i++) {
                        char karakter = (char) kod;
                        char noviKarakter = (char) (karakter + 16);
                        sb.append(noviKarakter);


                    }
                }
                break;


            } else {
                System.out.println("Nothing found!");
            }
        }






    }
}
