import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_Exercise_6 {

    public static void unesiListu(ArrayList<Integer> brojevi, String tekst){
        String[] delovi=tekst.split(" ");
        for (String deo : delovi){
            brojevi.add(Integer.parseInt(deo));
        }
    }

//    public static void ispisiListu(ArrayList<Integer> brojevi){
//        for (int broj : brojevi){
//            System.out.printf("%d ", broj);
//        }
//        System.out.println();
//    }

    public static int zbir(ArrayList<Integer> spil){
        int zbir=0;
        for (int karta : spil){
            zbir=zbir + karta;
        }
        return zbir;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String prvi=scanner.nextLine();
        String drugi=scanner.nextLine();

        ArrayList<Integer> prviSpil=new ArrayList<>();
        ArrayList<Integer> drugiSpil=new ArrayList<>();

        unesiListu(prviSpil,prvi);
        unesiListu(drugiSpil,drugi);
        int duzina_prve_liste= prviSpil.size();
        int duzina_druge_liste=drugiSpil.size();

        while (duzina_prve_liste != 0 && duzina_druge_liste != 0){

            int karta_iz_prvog_spila=prviSpil.get(0);
            int karta_iz_drugog_spila=drugiSpil.get(0);

            if (karta_iz_prvog_spila > karta_iz_drugog_spila){

                prviSpil.add(karta_iz_prvog_spila);
                prviSpil.add(karta_iz_drugog_spila);

                prviSpil.remove(0);
                drugiSpil.remove(0);

                duzina_prve_liste=prviSpil.size();
                duzina_druge_liste=drugiSpil.size();
            } else if (karta_iz_drugog_spila > karta_iz_prvog_spila){
                drugiSpil.add(karta_iz_drugog_spila);
                drugiSpil.add(karta_iz_prvog_spila);

                prviSpil.remove(0);
                drugiSpil.remove(0);

                duzina_prve_liste=prviSpil.size();
                duzina_druge_liste=drugiSpil.size();

            } else if (karta_iz_drugog_spila == karta_iz_prvog_spila){
                prviSpil.remove(0);
                drugiSpil.remove(0);

                duzina_prve_liste=prviSpil.size();
                duzina_druge_liste=drugiSpil.size();

            }

            }

        if(duzina_druge_liste !=0){
            int zbir_karata=zbir(drugiSpil);
            System.out.printf("Second player wins! Sum: %d", zbir_karata);
        } else if (duzina_prve_liste !=0){
            int zbir_karata=zbir(prviSpil);
            System.out.printf("First player wins! Sum: %d", zbir_karata);

        }


    }

    }

