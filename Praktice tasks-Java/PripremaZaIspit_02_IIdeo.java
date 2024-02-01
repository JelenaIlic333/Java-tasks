import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PripremaZaIspit_02_IIdeo {

    public static String okreniUnazad(String tekst){
        int n=tekst.length();
        StringBuilder sb=new StringBuilder();
        for (int i=n-1; i>=0; i--){
            sb.append(tekst.charAt(i));
        }
        return sb.toString();
    }

    public static boolean daLiSuMirrorReci(String prva, String druga){
        String drugaUnazad=okreniUnazad(druga);
        return prva.equals(drugaUnazad);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String unos=scanner.nextLine();
      //  Pattern regex= Pattern.compile("([@#])(?<prviDeo>[A-Za-z]{3,})\\1\\1(?<drugiDeo>[A-Za-z]{3,}\\1)");
        Pattern regex=Pattern.compile("([@#])(?<prviDeo>[A-Za-z]{3,})\\1\\1(?<drugiDeo>[A-Za-z]{3,})\\1");

        Matcher matcher=regex.matcher(unos);

        LinkedHashMap<String, String> paroviReci=new LinkedHashMap<>();

        while (matcher.find()){
            String rez=matcher.group();

            String prviDeo=matcher.group("prviDeo");
            String drugiDeo=matcher.group("drugiDeo");

            paroviReci.put(prviDeo,drugiDeo);
        }

        int n=paroviReci.entrySet().size();

        if (n==0){
            System.out.println("No word pairs found!");
        }else {
            System.out.printf("%d word pairs found!\n", n);
        }

        LinkedHashMap<String, String> mirrorParovi=new LinkedHashMap<>();

        for (Map.Entry<String,String> parkljuc_vrednost : paroviReci.entrySet()){
            String prvi=parkljuc_vrednost.getKey();
            String drugi=parkljuc_vrednost.getValue();

            if (daLiSuMirrorReci(prvi,drugi)){
                mirrorParovi.put(prvi,drugi);
            }
        }
        int brojMirrorReci=mirrorParovi.entrySet().size();
        if (brojMirrorReci==0){
            System.out.println("No mirror words!\n");
        }else {
            System.out.println("The mirror words are: ");
            StringBuilder rez=new StringBuilder();
            for (Map.Entry<String, String> kljucVrednost : mirrorParovi.entrySet()){
                String kljuc=kljucVrednost.getKey();
                String vrednost=kljucVrednost.getValue();
                rez.append(String.format("%s <=> %s, ",kljuc, vrednost));
            }
            String resenja=rez.toString();
            resenja=resenja.substring(0, rez.length() - 2);
            System.out.println(resenja);
        }
    }
}
