import java.util.Scanner;

public class Preliminarni_ispit_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        /**
         * First line – the number of students who attended the exam – an integer in the range [1...1000]
         * For each student on a separate line – their grade from the exam – a floating-point number in the range [2.00...6.00]
         */

        int broj_studenata=Integer.parseInt(scanner.nextLine());
        double ukupno_do_3=0;
        double ukupno_do_4=0;
        double ukupno_do_5=0;
        double ukupno_preko_5=0;
        double najbolji_studenti=0;
        double studenti_ocena_4=0;
        double studenti_ocena_3=0;
        double studenti_ocena_2=0;
        //double ukupno_ocene=0;
        //double prosecna_ocena=0;
        double prosek=0;
        double ukupno_ocena_do_3=0;
        double ukupno_ocena_do_4=0;
        double ukupno_ocena_do_5=0;
        double ukupno_ocena_preko_5=0;
        double ukupno_ocena=0;
        for (int i=broj_studenata; i>=1; i--) {
            double ocena = Double.parseDouble(scanner.nextLine());
            if (ocena >= 2.00 && ocena <= 2.99) {
                ukupno_do_3++;
                ukupno_ocena_do_3 = ukupno_ocena_do_3 + ukupno_do_3;

            } else if (ocena >= 3.00 && ocena <= 3.99) {
                ukupno_do_4++;
                ukupno_ocena_do_4 = ukupno_ocena_do_4 + ukupno_do_4;

            } else if (ocena >= 4.00 && ocena <= 4.99) {
                ukupno_do_5++;
                ukupno_ocena_do_5 = ukupno_ocena_do_5 + ukupno_do_5;

            } else if (ocena >= 5.00) {
                ukupno_preko_5++;
                ukupno_ocena_preko_5 = ukupno_ocena_preko_5 + ukupno_preko_5;
            }


            najbolji_studenti = (ukupno_preko_5 / broj_studenata) * 100;
            //  System.out.printf("Top students: %.2f%% ", najbolji_studenti);
            studenti_ocena_4 = ukupno_do_5 / broj_studenata * 100;
            // System.out.printf("Between 4.00 and 4.99: %.2f%%", studenti_ocena_4);
            studenti_ocena_3 = ukupno_do_4 / broj_studenata * 100;
            // System.out.printf("Between 3.00 and 3.99: %.2f%%", studenti_ocena_3);
            studenti_ocena_2 = ukupno_do_3 / broj_studenata * 100;
            // System.out.printf("Fail: %.2f%%", studenti_ocena_2);

            //ukupno_ocene = ukupno_do_3 + ukupno_do_4 + ukupno_do_5 + ukupno_preko_5;

            // prosecna_ocena = ukupno_ocene / broj_studenata;

            ukupno_ocena = ukupno_ocena + ocena;
            prosek = ukupno_ocena / broj_studenata;
            // System.out.printf("Average: %.2f", prosek);
        }

            System.out.printf("Top students: %.2f%%\n", najbolji_studenti);
            System.out.printf("Between 4.00 and 4.99: %.2f%%\n", studenti_ocena_4);
            System.out.printf("Between 3.00 and 3.99: %.2f%%\n", studenti_ocena_3);
            System.out.printf("Fail: %.2f%%\n", studenti_ocena_2);
            System.out.printf("Average: %.2f", prosek);

    }
}
