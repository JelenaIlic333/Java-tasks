import java.util.Scanner;

public class Zavrsni_ispit_02 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int minuti_hoda_dnevno=Integer.parseInt(scanner.nextLine());
        int broj_dnevnih_setnji=Integer.parseInt(scanner.nextLine());
        int kolirije_koje_macka_dnevno_uzima=Integer.parseInt(scanner.nextLine());

        int ukupna_setnja=broj_dnevnih_setnji * minuti_hoda_dnevno;
        int potrosene_kalorije_dnevno=ukupna_setnja * 5;
        double potrosene_kalorije= kolirije_koje_macka_dnevno_uzima * 0.5;
        if (potrosene_kalorije_dnevno >= potrosene_kalorije){
            System.out.printf("Yes, the walk for your cat is enough. " +
                    "Burned calories per day: %d. \n", potrosene_kalorije_dnevno);
        }else {
            System.out.printf("No, the walk for your cat is not enough." +
                    " Burned calories per day: %d.", potrosene_kalorije_dnevno);
        }
    }
}
