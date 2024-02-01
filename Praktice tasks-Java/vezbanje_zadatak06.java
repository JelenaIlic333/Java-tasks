import java.util.*;

public class vezbanje_zadatak06 {

    public static void ubaciAutoUMapu(LinkedHashMap<String, ArrayList<Integer>> automobili, String unos){
        String[] delovi=unos.split("\\|");
        String modeliVozila=delovi[0];
        int kilometraza=Integer.parseInt(delovi[1]);
        int gorivo=Integer.parseInt(delovi[2]);

        ArrayList<Integer> vrednosti=new ArrayList<>();
        vrednosti.add(kilometraza);
        vrednosti.add(gorivo);

        automobili.put(modeliVozila, vrednosti);
    }

    public static void ucitajAutomobile(LinkedHashMap<String, ArrayList<Integer>> automobili, int n){
        Scanner scanner=new Scanner(System.in);

        for (int i=1; i<=n; i++){
            String unos=scanner.nextLine();
            ubaciAutoUMapu(automobili, unos);
        }
    }

    public static void drive(LinkedHashMap<String, ArrayList<Integer>> automobili, String nazivVozila, int distanca, int gorivoPotrebnoZaVoznju){
        ArrayList<Integer> podaciVozila=automobili.get(nazivVozila);
        int kilometrazaTrenutna=podaciVozila.get(0);
        int kolicinaGoriva=podaciVozila.get(1);

        if (kolicinaGoriva >= gorivoPotrebnoZaVoznju){
            kilometrazaTrenutna= kilometrazaTrenutna + distanca;
            kolicinaGoriva=kolicinaGoriva - gorivoPotrebnoZaVoznju;
            ArrayList<Integer> novoStanje=new ArrayList<>();
            novoStanje.add(kilometrazaTrenutna);
            novoStanje.add(kolicinaGoriva);

            automobili.put(nazivVozila, novoStanje);

            System.out.printf("%s driven for %d kilometars. %d litars of fuel consumed.\n", nazivVozila, distanca, gorivoPotrebnoZaVoznju);

            if (kilometrazaTrenutna >= 100000){
                System.out.printf("Time to sell the %s!\n", nazivVozila);
                automobili.remove(nazivVozila);
            }
        }else {
            System.out.println("Not enough fuel to make that ride");
        }
    }

    public static void refuel(LinkedHashMap<String, ArrayList<Integer>> automobili, String nazivVozila, int kolicinaGoriva){
        ArrayList<Integer> podaciVozila=automobili.get(nazivVozila);
        int gorivoTrenutno=podaciVozila.get(1);

        if (gorivoTrenutno + kolicinaGoriva > 75){
            kolicinaGoriva= 75 - gorivoTrenutno;
        }
        gorivoTrenutno=gorivoTrenutno + kolicinaGoriva;
        podaciVozila.set(1, gorivoTrenutno);

        System.out.printf("%s refueled with %d liters.\n", nazivVozila, kolicinaGoriva);
    }

    public static void revert(LinkedHashMap<String, ArrayList<Integer>> automobili, String nazivVozila, int brojKilometara){
        ArrayList<Integer> podaciVozila=automobili.get(nazivVozila);
        int trenutnoKilometara=podaciVozila.get(0);

        if (trenutnoKilometara - brojKilometara < 10000){
            trenutnoKilometara= 10000;
        }else {
            trenutnoKilometara= trenutnoKilometara -brojKilometara;

            System.out.printf("%s mileage decreased by %d kilometers\n", nazivVozila, brojKilometara);
        }

        podaciVozila.set(0, trenutnoKilometara);
        automobili.put(nazivVozila, podaciVozila);
    }

    public static void ispisiMapuVozila(LinkedHashMap<String, ArrayList<Integer>> automobili){
        for (Map.Entry<String, ArrayList<Integer>> kljucVrednost : automobili.entrySet()){
            String nazivVozila= kljucVrednost.getKey();
            ArrayList<Integer> podaci= kljucVrednost.getValue();
            int mileage= podaci.get(0);
            int fuel=podaci.get(1);

            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n", nazivVozila, mileage, fuel);
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Integer>> automobili=new LinkedHashMap<>();

        for (int i=1; i<=n; i++){
            String unos=scanner.nextLine();
            String [] delovi=unos.split("\\|");
            String modelVozila=delovi[0];
            int kilometraza=Integer.parseInt(delovi[1]);
            int gorivo=Integer.parseInt(delovi[2]);

            ArrayList<Integer> vrednost=new ArrayList<>();
            vrednost.add(kilometraza);
            vrednost.add(gorivo);

            automobili.put(modelVozila, vrednost);
        }

        while (true){
            String tekst=scanner.nextLine();
            if (tekst.equals("Stop")) break;

            String[] deloviKomande=tekst.split(" : ");
            String nazivKomande=deloviKomande[0];
            String nazivVozila=deloviKomande[1];

            if (nazivKomande.equals("Drive")){
                int distanca=Integer.parseInt(deloviKomande[2]);
                int kolicinaGoriva=Integer.parseInt(deloviKomande[3]);
                drive(automobili, nazivVozila, distanca, kolicinaGoriva);

            } else if (nazivKomande.equals("Refuel")){
                int kolicinaGoriva=Integer.parseInt(deloviKomande[2]);
                refuel(automobili, nazivVozila, kolicinaGoriva);

            } else if (nazivKomande.equals("Revert")){
                int kolicinaKilometara=Integer.parseInt(deloviKomande[2]);
                revert(automobili, nazivVozila, kolicinaKilometara);
            }
        }
        ispisiMapuVozila(automobili);
    }
}
