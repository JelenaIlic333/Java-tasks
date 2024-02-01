import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Objects_and_Classes_Exercise_05 {
     static class Katalog {
         public String tip;
         public String model;
         public String boja;
         public int konjskaSnaga;

         public Katalog(String tip, String model, String boja, int konjskaSnaga) {
             this.tip = tip;
             this.model = model;
             this.boja = boja;
             this.konjskaSnaga = konjskaSnaga;
         }

//        public Katalog(String unos, String model, String boja, int konjskeSnage){
//            String [] delovi=unos.split(" ");
//             this.tip=delovi[0];
//             this.model=delovi[1];
//            this.boja=delovi[2];
//            this.konjskaSnaga=Integer.parseInt(delovi[3]);
//        }

         @Override
         public String toString() {
             StringBuilder sb = new StringBuilder();
             sb.append(String.format("\nType: %s\nModel: %s\nColor: %s\nHorsepower: %d\n", this.tip,
                     this.model, this.boja, this.konjskaSnaga));
             return sb.toString();
         }

         public int getKonjskaSnaga() {
             return this.konjskaSnaga;
         }

         public String getTip() {
             return this.tip;
         }

         public String getBoja() {
             return this.boja;
         }

         public String getModel() {
             return this.model;
         }
     }
         public static void ispisiModel(ArrayList<Katalog> listaKatalog, String unos_modela){
             for (Katalog trenutniModel : listaKatalog){
                 if (trenutniModel.getModel().equals(unos_modela)){
                     System.out.printf(trenutniModel.toString());
                 }
             }
         }
        public static double brojacKonjskihSnaga(ArrayList<Katalog> listaKatalog){
            double ukupnoKonjskeSnage=0;
            for (Katalog vrsta : listaKatalog){
                    ukupnoKonjskeSnage=ukupnoKonjskeSnage + vrsta.getKonjskaSnaga();
            }
            int n=listaKatalog.size();
            if (n==0){
                return 0.0;
            }
            double prosekKonjskihSnaga= ukupnoKonjskeSnage / n;
            return prosekKonjskihSnaga;

        }

        public static void ispis(ArrayList<Katalog> listaKataloga,String model){
            for(Katalog vozilo : listaKataloga){
                if (vozilo.getModel().equals(model)){
                    System.out.println("vozilo");
                }
            }
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Katalog> listaKatalog = new ArrayList<>();
        ArrayList<Katalog> automobili = new ArrayList<>();
        ArrayList<Katalog> kamioni = new ArrayList<>();

//        Katalog trenutni = null;
        while (true) {
            String unos = scanner.nextLine();
            if (unos.equals("End")) {
                break;
            }
            String[] deloviUnosa = unos.split("\\s+");
            String tipVozila = deloviUnosa[0];
            String model = deloviUnosa[1];
            String boja = deloviUnosa[2];
            int konjskeSnage = Integer.parseInt(deloviUnosa[3]);

            if (tipVozila.equals("car")) tipVozila = "Car";
            else tipVozila = "Truck";

            Katalog trenutni = new Katalog(tipVozila, model, boja, konjskeSnage);

            if (trenutni.getTip().equals("Car"))
                automobili.add(trenutni);
            else kamioni.add(trenutni);
            listaKatalog.add(trenutni);

        }
        while (true) {
            String unos_modela = scanner.nextLine();
            if (unos_modela.equals("Close the Catalogue")) break;
            ispisiModel(listaKatalog, unos_modela);


        }
        double prosekAutomobili = brojacKonjskihSnaga(automobili);
        double prosekKamioni = brojacKonjskihSnaga(kamioni);
        System.out.printf("Cars have average horsepower of: %.2f.\n", prosekAutomobili);
        System.out.printf("Trucks have average horsepower of: %.2f.", prosekKamioni);

    }


}
