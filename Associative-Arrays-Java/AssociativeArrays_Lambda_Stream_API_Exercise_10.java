import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_10 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String , ArrayList<Integer> > ucenikPoeni=new LinkedHashMap<>();

        while (true){
            String unos=scanner.nextLine();
            if (unos.equals("exam finished")) break;

            String[] deloviUnosa=unos.split("-");
            String imeUcenika=deloviUnosa[0];
            String nazivKursa=deloviUnosa[1];
            int poeni=Integer.parseInt(deloviUnosa[2]);

            ucenikPoeni.put(imeUcenika, new ArrayList<Integer>());
            ucenikPoeni.get(imeUcenika).add(poeni);
            ArrayList<String > naziv_kursa=new ArrayList<>();
            naziv_kursa.add(nazivKursa);
            int brojacKursa=0;
            if (nazivKursa.equals("naziv_kursa")){
                String prethodniKurs=nazivKursa;
                brojacKursa++;

            }
            int isti=ucenikPoeni.get(imeUcenika).get(poeni);

            if (isti>poeni){
                int veciPoeni=poeni;
            }

            if (nazivKursa.equals("banned")){
                ucenikPoeni.remove(imeUcenika);
            }











        }
    }
}
