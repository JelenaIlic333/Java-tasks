import java.util.Scanner;

public class Preliminarni_ispit_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /**
         * Fat percentage – an integer in the range [0…100]
         * Protein percentage – an integer in the range [0…100]
         * Carbohydrate percentage – an integer in the range [0…100]
         * Total calories - an integer in the range [1000…15000]
         * Percentage of water content - an integer in the range [0…100]
         */

        double procenat_masti=Double.parseDouble(scanner.nextLine());
        double procenat_proteina=Double.parseDouble(scanner.nextLine());
        double procenat_ugljenih_hidrata=Double.parseDouble(scanner.nextLine());
        int ukupno_kalorije=Integer.parseInt(scanner.nextLine());
        int procenat_vode=Integer.parseInt(scanner.nextLine());

        /**
         * 1 gram of fat = 9 calories
         * 1 gram of protein = 4 calories
         * 1 gram of carbohydrate = 4 calories
         */

        double masti=(ukupno_kalorije*procenat_masti)/100;
        double ukupno_masti=masti / 9;
        double proteina=(ukupno_kalorije*procenat_proteina)/100;
        double ukupno_proteini=proteina / 4;
        double ugljeni_hidrati=(ukupno_kalorije*procenat_ugljenih_hidrata)/100;
        double ukupno_ugljeni_hidrati=ugljeni_hidrati / 4;
        double tezina_hrane=ukupno_masti + ukupno_proteini + ukupno_ugljeni_hidrati;
        double kalorije_po_gramu=ukupno_kalorije/tezina_hrane;
        double voda= 100 - procenat_vode;
        double u_jednom_gramu=(kalorije_po_gramu*voda)/100;

        System.out.printf("%.4f", u_jednom_gramu);


    }
}
