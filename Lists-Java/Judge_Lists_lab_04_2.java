import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_lab_04_2 {
    public static void unosListe(ArrayList<Integer> brojevi, String [] tekst, int length){


        for (int i=0; i<length; i++){
            brojevi.add(Integer.parseInt(tekst[i]));
        }
    }

    public static void ispisListe(ArrayList<Integer> brojevi){

        for (int broj:brojevi){
            System.out.printf("%d ", broj);
        }
        System.out.println();
    }

    public static void dodaj(ArrayList<Integer> brojevi, int broj){
        brojevi.add(broj);
    }

    public static void obrisiPoVrednosti(ArrayList<Integer> brojevi, int broj){
        brojevi.remove(Integer.valueOf(broj));
    }

    public static void obrisiPoPoziciji(ArrayList<Integer> brojevi, int pozicija){
        brojevi.remove(pozicija);
    }

    public static void ubaciNaPoziciju(ArrayList<Integer> brojevi, int broj, int pozicija){
        brojevi.add(pozicija,broj);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String tekst=scanner.nextLine();
        String [] bojeviKaoTekst=tekst.split(" ");
        int n=bojeviKaoTekst.length;

        ArrayList<Integer> brojevi=new ArrayList<>();
        unosListe(brojevi, bojeviKaoTekst, n);

        while (true){
            String komanda=scanner.nextLine();
            if(komanda.equals("end")){
                break;
            }
            String [] delovi=komanda.split(" ");

            String operacija=delovi[0];

            int prviBroj=Integer.parseInt(delovi[1]);

            switch (operacija){
                case "Add":
                    dodaj(brojevi,prviBroj);
                    break;
                case "Remove":
                    obrisiPoVrednosti(brojevi,prviBroj);
                    break;
                case "RemoveAt":
                    obrisiPoPoziciji(brojevi,prviBroj);
                    break;
                case "Insert":
                    int pozicijaNaKojuUbacujem=Integer.parseInt(delovi[2]);
                    ubaciNaPoziciju(brojevi,prviBroj,pozicijaNaKojuUbacujem);
                    break;
            }
        }
        ispisListe(brojevi);
    }
}
