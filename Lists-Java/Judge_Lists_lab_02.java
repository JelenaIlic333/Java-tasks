import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_lab_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String tekst = scanner.nextLine();
        String[] delovi = tekst.split(" ");
        int n = delovi.length;

        ArrayList<Integer> brojevi = new ArrayList<>();

        for (int i = 0; i<n;i++){
            brojevi.add(Integer.parseInt(delovi[i]));
        }
        for(int i=0; i<n/2; i++){
            Integer trenutni=brojevi.get(i);
            int trenutnaDimenzijaListe=brojevi.size();
            Integer odgovarajuciSaKraja= brojevi.get(trenutnaDimenzijaListe-1);
            brojevi.set(i,trenutni+odgovarajuciSaKraja);
            brojevi.remove(trenutnaDimenzijaListe-1);
        }

        for (int broj : brojevi){
            System.out.printf("%d ", broj);
        }


    }
}
