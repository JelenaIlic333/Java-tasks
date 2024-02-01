import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test_zadatak03 {

    public static void test(LinkedHashMap<String, ArrayList<String >> recDefinicija,ArrayList<String> uneteReciDrugiRed){

        for (int i=0; i< uneteReciDrugiRed.size(); i++){
            String trazenaRecLista=uneteReciDrugiRed.get(i);

             for (Map.Entry<String, ArrayList<String>> reciIDefinicije : recDefinicija.entrySet()){

                String trazenaRec=reciIDefinicije.getKey();
                ArrayList<String> definicije=reciIDefinicije.getValue();

                if (trazenaRecLista.equals(trazenaRec)){
                    System.out.printf("%s:\n", trazenaRec);
                     for (String def : definicije) {
                    System.out.printf("-%s\n", def );
                    }
                 }
            }
        }
    }

        public static void predaj(LinkedHashMap<String, ArrayList<String >> recDefinicija) {
//            for (int i = 0; i < uneteReciDrugiRed.size(); i++) {
//                String trazenaRecLista = uneteReciDrugiRed.get(i);

                for (Map.Entry<String, ArrayList<String>> reciIDefinicije : recDefinicija.entrySet()) {
                    String trazenaRec = reciIDefinicije.getKey();
                    //int duzinaMape = recDefinicija.size();

                   // for (int j = 0; j <= duzinaMape; j++) {
                        System.out.printf("%s ", trazenaRec);
                    }
                }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            String ceoUnos = scanner.nextLine();
            String[] nisUnosa = ceoUnos.split("\\|");

        LinkedHashMap<String, ArrayList<String>> recDefinicija = new LinkedHashMap<>();

            for (int i = 0; i < nisUnosa.length; i++) {
                String[] nisDeoUnosa = nisUnosa[i].split(": ");

                String Unetarec = nisDeoUnosa[0].trim();
                String definicija = nisDeoUnosa[1];
                //programmer: an animal, which turns coffee into code | developer: a magician
                //fish | domino
                //Hand Over

                if (recDefinicija.containsKey(Unetarec)){
                    recDefinicija.get(Unetarec).add(definicija);
                }else if (!recDefinicija.containsKey(Unetarec)){
                    recDefinicija.put(Unetarec, new ArrayList<>());
                    recDefinicija.get(Unetarec).add(definicija);
                }
//                recDefinicija.putIfAbsent(Unetarec, new ArrayList<>());
//                recDefinicija.get(Unetarec).add(definicija);


//                definicije.add(definicija);
                 //proveriDaLiSeRecNalaziUMapu(recDefinicija, Unetarec, definicija);
//                recDefinicija.put(Unetarec, definicije);
            }

                String trazeneReci = scanner.nextLine();
                String[] nizTrazenihReci = trazeneReci.split(" \\| ");

                ArrayList<String> uneteReciDrugiRed = new ArrayList<>();

                for (int i=0; i<nizTrazenihReci.length; i++){
                    uneteReciDrugiRed.add(nizTrazenihReci[i]);
                }


                String komande = scanner.nextLine();
                if (komande.equals("Test")) {
                    test(recDefinicija, uneteReciDrugiRed);
                } else if (komande.equals("Hand Over")) {
                   predaj(recDefinicija);

                }

        }
    }



