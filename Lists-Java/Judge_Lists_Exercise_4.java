import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_Exercise_4 {
    public static void unesiListu(ArrayList<Integer> brojevi, String tekst){

        String[] delovi = tekst.split(" ");
//        for (String deo : delovi) {
//            brojevi.add(Integer.parseInt(deo));
//        }
        for (int i=0; i<delovi.length; i++){
            brojevi.add(Integer.parseInt(delovi[i]));
        }

    }

    public static void ispisiListu(ArrayList<Integer> brojevi){
        for (int broj : brojevi) {
            System.out.printf("%d ",broj);
        }
    }

    public static void dodaj(ArrayList<Integer> brojevi, int broj){
        brojevi.add(broj);
    }

    public static void ukloni(ArrayList<Integer> brojevi, int broj){
        if (broj<=brojevi.size()-1 && broj>=0) {
            brojevi.remove(broj);
        }else {
            System.out.println("Invalid index");
        }
    }
    public static void dodajInsert(ArrayList<Integer> brojevi, int broj, int i){
        if(i>=brojevi.size() && broj>=0){
            System.out.println("Invalid index");
        }else {
            brojevi.add(i, broj);
        }
    }
    public static void pomeri(ArrayList<Integer> brojevi, int broj, String smer){
        if (smer.equals("left")){
            for (int i=0; i<broj; i++) {
                int duzina_liste=brojevi.size();
                int pomocna=brojevi.get(0);
                for (int j=1; j<duzina_liste; j++){
                    brojevi.set(j-1, brojevi.get(j));
                }
                brojevi.set(duzina_liste-1,pomocna);
            }

        } else if (smer.equals("right")){
            for (int i=0; i<broj; i++){
                int duzina_lista=brojevi.size();
                int pomocna=brojevi.get(duzina_lista-1);
                for (int j=duzina_lista-1; j>=1; j--){
                    brojevi.set(j, brojevi.get(j-1));
                }
                brojevi.set(0, pomocna);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tekst=scanner.nextLine();

        ArrayList<Integer> brojevi=new ArrayList<>();
        unesiListu(brojevi, tekst);
        while (true){
            String komanda=scanner.nextLine();
            if (komanda.equals("End")){
                break;
            }
            String[] delovi=komanda.split(" ");
            String operacija=delovi[0];
            switch (operacija){
                case "Add":
                    dodaj(brojevi,Integer.parseInt(delovi[1]));
                    break;
                case "Remove":
                    ukloni(brojevi,Integer.parseInt(delovi[1]));
                    break;
                case "Insert":
                    dodajInsert(brojevi,Integer.parseInt(delovi[1]), Integer.parseInt(delovi[2]));
                    break;
                case "Shift":
                    pomeri(brojevi, Integer.parseInt(delovi[2]), delovi[1]);
                    break;
            }
        }
        ispisiListu(brojevi);
    }
}
