import java.util.Scanner;

public class StringLab_04 {
    public static String cenzurisi(String rec){
        int n=rec.length();
        String rez="";
        for (int i=1; i<=n; i++){
            rez=rez.concat("*");
        }
        return rez;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] banovaneReci=scanner.nextLine().split(", ");
        String tekstKojiCenzurisemo=scanner.nextLine();

        for (String rec : banovaneReci){
            String cenzurisanoRec=cenzurisi(rec);
            tekstKojiCenzurisemo=tekstKojiCenzurisemo.replaceAll(rec, cenzurisanoRec);
        }
        System.out.println(tekstKojiCenzurisemo);
    }
}
