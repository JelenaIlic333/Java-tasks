import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StringLabExercise_05 {
    public static String pomnoziVelikeBrojevePrekoStringova(String velikiBroj, String jednocifreni){
        int broj=Integer.parseInt(jednocifreni);
        if (broj==0) return "0";
        int n=velikiBroj.length();
        int prenos=0;
        StringBuilder sb=new StringBuilder();

        for (int i=n-1; i>=0; i--) {
            char trenutniKarakter = velikiBroj.charAt(i);
            int zaistaCifra = Integer.parseInt(trenutniKarakter + "");
            int rez = zaistaCifra * broj + prenos;
            if (rez > 9) {
                prenos = rez / 10;
            } else {
                prenos = 0;
            }
            int cifraRezultata = rez % 10;
            sb.append(cifraRezultata);
        }
            if (prenos != 0) sb.append(prenos);
            System.out.println(sb.reverse());

        return "";
    }

    public static String ukloniPocetneNule(String s){
        int n=s.length();
        int pozicijaPrveCifreKojaNije0= -1;
        for (int i=0; i<n; i++){
            if (s.charAt(i) != '0'){
                pozicijaPrveCifreKojaNije0=i;
                return s.substring(pozicijaPrveCifreKojaNije0);
            }
        }
        return "0";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String velikiBroj=scanner.nextLine();
        velikiBroj=ukloniPocetneNule(velikiBroj);
        String cifra= scanner.nextLine();
        String resenjeSaVodecimNulama=pomnoziVelikeBrojevePrekoStringova(velikiBroj, cifra);
        System.out.println(resenjeSaVodecimNulama);
    }
}
