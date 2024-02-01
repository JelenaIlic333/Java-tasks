import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class StringLab_02 {

    public static String umnoziTekst(String tekst, int n){
        String rez="";
        for (int i=1; i<=n; i++){
            rez=rez.concat(tekst);
        }
        return rez;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] podaci=scanner.nextLine().split(" ");
        String rez="";
        for (String s : podaci){
            int brojPonavljanjaNovogNiza=s.length();
            String visestrukiTrenutniTekst=umnoziTekst(s, brojPonavljanjaNovogNiza);
            rez= rez.concat(visestrukiTrenutniTekst);
        }
        System.out.println(rez);
    }

}
