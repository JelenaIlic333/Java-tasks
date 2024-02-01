import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Objects_and_Classes_Exercise_06 {
    static  class KlasaOsobe {
        public String ime;
        public int id;
        public int godine;


        public KlasaOsobe(String ime, int id, int godine){
            this.ime=ime;
            this.id=id;
            this.godine=godine;
        }
        public String getIme(){ return this.ime; }
        public int getId(){ return this.id; }
        public int getGodine(){ return this.godine; }


        public static void ispisi(ArrayList<KlasaOsobe> unosiOsoba){
            for (KlasaOsobe o : unosiOsoba){
                String ime= o.getIme();
                int id=o.getId();
                int godine=o.getGodine();
                System.out.printf("%s with ID: %d is %d years old.\n",ime, id, godine );
            }
        }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<KlasaOsobe> osoba=new ArrayList<>();

        while (true) {
            String unos = scanner.nextLine();
            if (unos.equals("End")) break;
            String[] deloviUnosa = unos.split(" ");
            String ime = deloviUnosa[0];
            int id = Integer.parseInt(deloviUnosa[1]);
            int godine = Integer.parseInt(deloviUnosa[2]);

//            KlasaOsobe unosiOsoba=new KlasaOsobe(ime, id, godine);
//            osoba.add(unosiOsoba);
            osoba.add(new KlasaOsobe(ime,id,godine));


        }
        osoba.sort(Comparator.comparing(KlasaOsobe :: getGodine));
        KlasaOsobe.ispisi(osoba);



    }
}
