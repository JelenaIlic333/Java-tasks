import java.util.Scanner;

public class Zavrsni_ispit_04 {
    public static void main(String[] args) {

        Scanner scanners=new Scanner(System.in);

        int broj_dana=Integer.parseInt(scanners.nextLine());
        double ukupna_kolicina_hrane=Double.parseDouble(scanners.nextLine());
        double ukupno_pas=0;
        double ukupno_macka=0;
        double keks_za_dan=-1;
        double ukupno_keks=0;

        for (int i=1; i<=broj_dana; i++){
            int kolicina_hrane_pas=Integer.parseInt(scanners.nextLine());
            int kolicina_hrane_macka=Integer.parseInt(scanners.nextLine());
            ukupno_pas=ukupno_pas + kolicina_hrane_pas;
            ukupno_macka=ukupno_macka + kolicina_hrane_macka;
            if (i % 3==0){
                double kolicina_hrane_za_jedan_dan= kolicina_hrane_pas + kolicina_hrane_macka;
                keks_za_dan=kolicina_hrane_za_jedan_dan * 0.1;
                ukupno_keks= ukupno_keks + keks_za_dan;
            }
        }
        System.out.printf("Total eaten biscuits: %.0fgr.\n", ukupno_keks);
        double ukupna_hrana_macka_pas= ukupno_pas + ukupno_macka;
        double procenat_ukupne_hrane= ukupna_hrana_macka_pas/ukupna_kolicina_hrane * 100;
        System.out.printf("%.2f%% of the food has been eaten.\n", procenat_ukupne_hrane );
        double pas_procenat= ukupno_pas/ ukupna_hrana_macka_pas * 100;
        double macka_procenat= ukupno_macka / ukupna_hrana_macka_pas * 100;
        System.out.printf("%.2f%% eaten by the dog.\n", pas_procenat);
        System.out.printf("%.2f%% eaten by the cat.", macka_procenat);
    }
}
