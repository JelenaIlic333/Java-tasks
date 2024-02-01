import java.util.Scanner;

public class Preliminarni_ispit_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /**
         * First line – number of people – an integer in the range [1 … 20]
         * Second line – season – text with options - "spring", "summer", "autumn" or "winter"
         */

        int broj_ljudi=Integer.parseInt(scanner.nextLine());
        String sezona=scanner.nextLine();
        double cena=-1;


        if (broj_ljudi <=5 && sezona.equals("spring")){
           cena=50.00;
        } else if (broj_ljudi<=5 && sezona.equals("summer")){
            cena=48.50;
        } else if (broj_ljudi<=5 && sezona.equals("autumn")){
            cena=60.00;
        } else if (broj_ljudi<=5 && sezona.equals("winter")){
            cena=86.00;
        } else if (broj_ljudi>5 && sezona.equals("spring")){
            cena=48.00;
        } else if (broj_ljudi>5 && sezona.equals("summer")){
            cena=45.00;
        } else if (broj_ljudi>5 && sezona.equals("autumn")){
            cena=49.50;
        } else if (broj_ljudi>5 && sezona.equals("winter")){
            cena=85.00;
        }
        double ukupna_cena=broj_ljudi * cena;
        if (sezona.equals("summer")){
            double popust=ukupna_cena * 15 /100;
            double sa_popustom=ukupna_cena - popust;
            System.out.printf("%.2f USD.", sa_popustom);
        } else if (sezona.equals("winter")){
            double povecanje_cene=ukupna_cena * 8/100;
            double sa_povecanjem= ukupna_cena + povecanje_cene;
            System.out.printf("%.2f USD.", sa_povecanjem);
        }else {
            System.out.printf("%.2f USD.", ukupna_cena);
        }

    }
}
