import java.util.Random;
import java.util.Scanner;

public class Objects_and_Classes_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String unos=scanner.nextLine();
        String [] reci=unos.split(" ");
        int n=reci.length;

        Random rng= new Random();

        for (int i=0; i<n; i++){
            int nasumicnaPozicija=rng.nextInt(n);

            String pomocna=reci[i];
            reci[i]=reci[nasumicnaPozicija];
            reci[nasumicnaPozicija]=pomocna;
        }

        for (String rec : reci){
            System.out.println(rec);
        }
    }
}
