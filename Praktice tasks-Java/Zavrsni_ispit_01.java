import java.util.Scanner;

public class Zavrsni_ispit_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int zakup_hale=Integer.parseInt(scanner.nextLine());
        double torta=zakup_hale*0.20;
        double pice=torta * 0.55;
        int zabavljac=zakup_hale / 3;
        double potreban_budzet= zakup_hale + torta + pice + zabavljac;
        System.out.println(potreban_budzet);
    }
}
