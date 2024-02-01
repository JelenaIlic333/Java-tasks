import java.util.Scanner;

public class Zavrsni_ispit_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int kolicina_kupljene_hrane=Integer.parseInt(scanner.nextLine());
        int ukupna_kolicina_hrane=0;

        while (true){
            String dobio_je_svoj_dom=scanner.nextLine();
            if (dobio_je_svoj_dom.equals("Adopted")){
                break;
            }
            int kolicina_po_obroku=Integer.parseInt(dobio_je_svoj_dom);
            ukupna_kolicina_hrane=ukupna_kolicina_hrane + kolicina_po_obroku;
        }
        int kolicina_hrane_grami= kolicina_kupljene_hrane * 1000;

        if (kolicina_hrane_grami>=ukupna_kolicina_hrane){
            int preostalo_hrane= kolicina_hrane_grami - ukupna_kolicina_hrane;
            System.out.printf("Food is enough! Leftovers: %d grams.", preostalo_hrane);
        }else {
            int nedostaje_hrane=ukupna_kolicina_hrane - kolicina_hrane_grami;
            System.out.printf("Food is not enough. You need %d grams more.",nedostaje_hrane);
        }

    }
}
