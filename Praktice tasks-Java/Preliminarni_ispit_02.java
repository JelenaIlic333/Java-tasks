import java.util.Scanner;

public class Preliminarni_ispit_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /**
         * First line – number of days Santa is away – an integer in the range [1…5000]
         * Second line – food left in kilograms – an integer in the range [0…100000]
         * Third line – food per day for the first deer in kilograms – a floating-point number in the range [0.00…100.00]
         * Fourth line – food per day for the second deer in kilograms – a floating-point number in the range [0.00…100.00]
         * Fifth line – food per day for the third deer in kilograms – a floating-point number in the range [0.00…100.00]
         */

        int broj_dana_odsustva=Integer.parseInt(scanner.nextLine());
        int preostala_hraana=Integer.parseInt(scanner.nextLine());
        double hrana_prvi_jelen=Double.parseDouble(scanner.nextLine());
        double hrana_drugi_jelen=Double.parseDouble(scanner.nextLine());
        double hrana_treci_jelen=Double.parseDouble(scanner.nextLine());

        double prvi_jelen=broj_dana_odsustva * hrana_prvi_jelen;
        double drugi_jelen=broj_dana_odsustva * hrana_drugi_jelen;
        double treci_jelen=broj_dana_odsustva * hrana_treci_jelen;

        double ukupno_hrana=prvi_jelen + drugi_jelen + treci_jelen;


        if (preostala_hraana>=ukupno_hrana){
            double razlika= Math.floor(preostala_hraana - ukupno_hrana);
            System.out.printf("%.0f kilos of food left.\n", razlika);
        }else if (preostala_hraana<=ukupno_hrana){
            double nedostaje_hrane=Math.ceil(ukupno_hrana - preostala_hraana);
            System.out.printf("%.0f more kilos of food are needed.", nedostaje_hrane);
        }
    }
}
