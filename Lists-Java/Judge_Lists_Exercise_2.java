import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_Exercise_2 {

    public static void unesiListu(ArrayList<Integer> brojevi, String tekst){
        String[] delovi=tekst.split(" ");
        for (String deo : delovi){
            brojevi.add(Integer.parseInt(deo));
        }
    }

    public static void ispisiListu(ArrayList<Integer> brojevi){
        for (int broj : brojevi){
            System.out.printf("%d ", broj);
        }
        System.out.println();
    }
    public static void obrisiSvePoVrednisti(ArrayList<Integer> brojevi, int broj){
        while (brojevi.contains(broj)){
            brojevi.remove(Integer.valueOf(broj));
        }
    }

    public static void ubaciNaPoziciju(ArrayList<Integer> brojevi, int broj, int pozicija){
        brojevi.add(pozicija,broj);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tekst=scanner.nextLine();

        ArrayList<Integer> brojevi=new ArrayList<>();

        unesiListu(brojevi,tekst);

        while (true){
            String komanda=scanner.nextLine();

            if(komanda.equals("end"))break;

            String[] delovi=komanda.split(" ");

            String nazivKomande=delovi[0];

            int prviBroj=Integer.parseInt(delovi[1]);

            if (nazivKomande.equals("Delete")){
                obrisiSvePoVrednisti(brojevi, prviBroj);
            } else if (nazivKomande.equals("Insert")){
                int pozicijaNaKojuUbacujem=Integer.parseInt(delovi[2]);
                ubaciNaPoziciju(brojevi,prviBroj,pozicijaNaKojuUbacujem);
            }
        }
        ispisiListu(brojevi);
    }
}
