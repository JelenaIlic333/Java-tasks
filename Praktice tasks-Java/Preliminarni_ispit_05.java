import java.util.Scanner;

public class Preliminarni_ispit_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int broj_morskih_izleta = Integer.parseInt(scanner.nextLine());
        int broj_planinskih_izleta = Integer.parseInt(scanner.nextLine());
        int cena;
        int ukupna_cena_sea = 0;
        int ukupna_cena_mountain = 0;
        int profit = 0;

//        for (int i = broj_morskih_izleta; i>0; i--) {
//            for (int j =broj_planinskih_izleta; j>0; j--){
        while (true) {
            String naziv_paketa = scanner.nextLine();
            if (naziv_paketa.equals("Stop")) {
                System.out.printf("Profit: %d USD.", profit);
                break;
            }
            if (naziv_paketa.equals("sea") && broj_morskih_izleta>0){

                cena = 680;
                ukupna_cena_sea = ukupna_cena_sea + cena;
                broj_morskih_izleta--;

            } else if
            (naziv_paketa.equals("mountain") && broj_planinskih_izleta>0) {

                cena = 499;
                ukupna_cena_mountain = ukupna_cena_mountain + cena;
                broj_planinskih_izleta--;

            }
            profit = ukupna_cena_sea + ukupna_cena_mountain;

            if (broj_morskih_izleta <= 0 && broj_planinskih_izleta <= 0) {
                System.out.println("Good job! Everything is sold.");
                System.out.printf("Profit: %d USD.", profit);
                return;
            }


            //profit = ukupna_cena_sea + ukupna_cena_mountain;

        }
           // System.out.println("Good job! Everything is sold.");
           // System.out.printf("Profit: %d USD.", profit);

//            if (broj_morskih_izleta==0 || broj_morskih_izleta==0){
//                System.out.println("Good job! Everything is sold.");
//            }

        }

    }
