import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_lab_03 {

    public static void popuniListu(ArrayList<Integer> brojevi, String tekst){
        String [] delovi=tekst.split(" ");
         int n=delovi.length;

         for (int i=0; i<n; i++){
             brojevi.add(Integer.parseInt(delovi[i]));
         }
    }

    public static void ispisiListu(ArrayList<Integer> brojevi){
        for (int broj : brojevi){
            System.out.printf("%d ", broj);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String prvi=scanner.nextLine();
        String drugi=scanner.nextLine();

        ArrayList<Integer> brojeviPrvi=new ArrayList<>();
        ArrayList<Integer> brojeviDrugi=new ArrayList<>();

        popuniListu(brojeviPrvi, prvi);
        popuniListu(brojeviDrugi, drugi);

        int dimenzijaPrvi=brojeviPrvi.size();
        int dimenzijaDrugi=brojeviDrugi.size();

        int vecaDuzina,manjaDuzina;

        if(dimenzijaDrugi > dimenzijaPrvi){
            vecaDuzina=dimenzijaDrugi;
            manjaDuzina=dimenzijaPrvi;
        }else {
            vecaDuzina=dimenzijaPrvi;
            manjaDuzina=dimenzijaDrugi;
        }

        ArrayList<Integer> rezultat= new ArrayList<>();

        for (int i=0; i<manjaDuzina; i++){
            rezultat.add(brojeviPrvi.get(i));
            rezultat.add(brojeviDrugi.get(i));
        }

        if (vecaDuzina==brojeviPrvi.size()){
            for (int i=manjaDuzina; i<vecaDuzina; i++){
                rezultat.add(brojeviPrvi.get(i));
            }
        }else {
            for (int i=manjaDuzina; i<vecaDuzina; i++){
                rezultat.add(brojeviDrugi.get(i));
            }
        }

        ispisiListu(rezultat);
//        rezultat.addAll(brojeviPrvi);
//        ispisiListu(rezultat);
    }

}
