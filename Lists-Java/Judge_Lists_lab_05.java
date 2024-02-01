import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_lab_05 {

    public static void unosListe(ArrayList<Integer> brojevi, String [] tekst, int length){
        for (int i=0; i<length; i++){
            brojevi.add(Integer.parseInt(tekst[i]));
        }
    }

    public static void ispisListe(ArrayList<Integer> brojevi, String uslov, int broj){
        for (int x:brojevi){
            switch (uslov){
                case "<":
                    if (x < broj){
                        System.out.printf("%d ", x);
                    }
                break;
                case ">":
                    if (x > broj){
                        System.out.printf("%d ", x);
                    }
                break;
                case "<=":
                    if (x <= broj){
                        System.out.printf("%d ", x);
                    }
                    break;
                case ">=":
                    if (x >= broj){
                        System.out.printf("%d ", x);
                    }
                    break;
            }

        }
        System.out.println();
    }

    public static void daLiSadrziBroj(ArrayList<Integer> brojevi, int broj){
        boolean daLiJeUListi=brojevi.contains(broj);
        if (daLiJeUListi){
            System.out.println("Yes");
        }else {
            System.out.println("No such number");
        }

    }

    public static void evenOdd(ArrayList<Integer> brojevi, String even_odd){
        switch (even_odd){
            case "even":
                for (int x : brojevi) {
                    if (x % 2 == 0) {
                        System.out.printf("%d ", x);
                    }
                }
                break;
            case "odd":
                for (int x : brojevi) {
                    if (x % 2 != 0) {
                        System.out.printf("%d ", x);
                    }
                }
                break;
        }
        System.out.println();

    }

    public static void zbir (ArrayList<Integer> brojevi){
        int suma_svih_elemenata=0;
        for (int x : brojevi){
            suma_svih_elemenata=suma_svih_elemenata + x;
        }
        System.out.printf("%d \n", suma_svih_elemenata);

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

            switch (operacija){
                case "Contains":
                    int prviBroj=Integer.parseInt(delovi[1]);
                    daLiSadrziBroj(brojevi,prviBroj);
                    break;
                case "Print":
                    String even_odd=delovi[1];
                        evenOdd(brojevi, even_odd);
                    break;
                case "Get":
                    String sum=delovi[1];
                    zbir(brojevi);
                    break;
                case "Filter":
                    String uslov=delovi[1];
                    int broj=Integer.parseInt(delovi[2]);
                        ispisListe(brojevi, uslov, broj);

            }
        }

    }

}
