import java.util.Scanner;

public class Zavrsni_ispit_03 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        String voce=scanner.nextLine();
        String velicina_pakovanja=scanner.nextLine();
        int velicina_paketa=Integer.parseInt(scanner.nextLine());
        double cena_po_pakovanju=0;
        double ukupna_cena=0;
        double popust_50=0;
        double popust_15=0;
        /**
         * Лубеница Манго Ананас Малина
         * : "Watermelon", "Mango", "Pineapple" or "Raspberry"
         * "small" or "big"
         */

        if (voce.equals("Watermelon") && velicina_pakovanja.equals("small")){
            cena_po_pakovanju=56.00;
           // ukupna_cena=cena_po_pakovanju*2;
        }else if (voce.equals("Watermelon") && velicina_pakovanja.equals("big")){
            cena_po_pakovanju=28.70;
            //ukupna_cena=cena_po_pakovanju*5;
        }else if (voce.equals("Mango") && velicina_pakovanja.equals("small")){
            cena_po_pakovanju=36.66;
           // ukupna_cena=cena_po_pakovanju*2;
        }else if (voce.equals("Mango") && velicina_pakovanja.equals("big")){
            cena_po_pakovanju=19.60;
           // ukupna_cena=cena_po_pakovanju*5;
        }else if (voce.equals("Pineapple") && velicina_pakovanja.equals("small")){
            cena_po_pakovanju=42.10;
           // ukupna_cena=cena_po_pakovanju*2;
        }else if (voce.equals("Pineapple") && velicina_pakovanja.equals("big")){
            cena_po_pakovanju=24.80;
           // ukupna_cena=cena_po_pakovanju*5;
        }else if (voce.equals("Raspberry") && velicina_pakovanja.equals("small")){
            cena_po_pakovanju=20.00;
           // ukupna_cena=cena_po_pakovanju*2;
        }else if (voce.equals("Raspberry") && velicina_pakovanja.equals("big")){
            cena_po_pakovanju=15.20;
           // ukupna_cena=cena_po_pakovanju*5;
        }
        if (velicina_pakovanja.equals("big")){
            ukupna_cena=cena_po_pakovanju * 5;
        } else if (velicina_pakovanja.equals("small")){
            ukupna_cena=cena_po_pakovanju * 2;
        }
        double cena_kupljenog_paketa=ukupna_cena * velicina_paketa;

        if (cena_kupljenog_paketa>=400 && cena_kupljenog_paketa<=1000){
            popust_15=cena_kupljenog_paketa * 0.15;
            double ukupan_popust_15=cena_kupljenog_paketa - popust_15;
            System.out.printf("%.2f USD.", ukupan_popust_15);
        } else if (cena_kupljenog_paketa>1000){
            popust_50=cena_kupljenog_paketa * 0.50;
            double ukupan_popust_50=cena_kupljenog_paketa - popust_50;
            System.out.printf("%.2f USD.", ukupan_popust_50);
        }else {
            System.out.printf("%.2f USD.",cena_kupljenog_paketa);
        }

    }}
