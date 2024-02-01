import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PripremaZaIspit_02 {

    public static String izdvojiSamoCifre(String tekst){
        Pattern regex=Pattern.compile("[0-9]");
        StringBuilder sb=new StringBuilder();
        Matcher matcher_ceo_string=regex.matcher(tekst);

        while (matcher_ceo_string.find()){
            sb.append(matcher_ceo_string.group());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Pattern regex=Pattern.compile("^@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+$");
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        String sifraProizvoda="00";

        for (int i=0; i<n; i++){
            String unos=scanner.nextLine();
            Matcher matcher=regex.matcher(unos);

            if (matcher.find()){
                String poklapanje=matcher.group();
                sifraProizvoda=izdvojiSamoCifre(poklapanje);
            }else {
                System.out.println("Invalid barcode");
                continue;
            }
            if (sifraProizvoda.equals("")){
                sifraProizvoda="00";
            }
            System.out.println("Product group: " + sifraProizvoda);
        }
    }
}
