import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_Exercise_8 {

    public  static void unesi_listu(ArrayList<String> lista_unos, String unos){
        String[] delovi=unos.split(" ");
        for (String deo : delovi){
            lista_unos.add(deo);
        }
    }
    public static void ispisiListu(ArrayList<String> lista_unosa){
        for (String deo : lista_unosa){
            System.out.printf("%s ", deo);
        }
        System.out.println();
    }

    public static void merge(ArrayList<String> lista_unos, int pocetni_unos, int krajnji_unos){

        for (int i=pocetni_unos; i<krajnji_unos; i++){
            if (krajnji_unos> lista_unos.size()){
                krajnji_unos= lista_unos.size()-1;
            }
            if (pocetni_unos >= 0) {
                String pomocna_prvi_element = lista_unos.get(pocetni_unos);
                String drugi_element = lista_unos.get(pocetni_unos+1);
                String nova_vrednost = pomocna_prvi_element.concat(drugi_element);
                lista_unos.set(pocetni_unos, nova_vrednost);
                lista_unos.remove(drugi_element);
            }

        }

    }

    public static void divide(ArrayList<String> lista_unosa, int pocetni_unos, int krajnji_unos){
       String element_koji_delimo= lista_unosa.get(pocetni_unos);
       int duzina_elementa_kod_delimo=element_koji_delimo.length();
       if (duzina_elementa_kod_delimo % krajnji_unos ==0){
           int broj_karaktera=duzina_elementa_kod_delimo / krajnji_unos;
           int brojac_index=pocetni_unos;
           for (int i=0; i<duzina_elementa_kod_delimo-1; i=i + broj_karaktera){
               String novi_element="";
               for (int j=i; j< i + broj_karaktera; j++){
                   novi_element=novi_element + element_koji_delimo.charAt(j);
               }
               brojac_index++;
               lista_unosa.add(brojac_index, novi_element);
           }
           lista_unosa.remove(pocetni_unos);

       } else if (duzina_elementa_kod_delimo % krajnji_unos !=0){
           int broj_karaktera=duzina_elementa_kod_delimo / krajnji_unos;
           int ostatak_pri_deljenju=duzina_elementa_kod_delimo % krajnji_unos;
           int brojac_index=pocetni_unos;
           int novi_brojac=0;
           for (int i=0; i<duzina_elementa_kod_delimo-1; i= i + broj_karaktera){
               String novi_element="";
               if (novi_brojac<krajnji_unos-1){
                   for (int j=i; j< i + broj_karaktera; j++){

                       novi_element=novi_element + element_koji_delimo.charAt(j);
                   }

               } else if (novi_brojac==krajnji_unos-1){
                   for (int j=i; j<i+broj_karaktera+ostatak_pri_deljenju; j++){
                       novi_element=novi_element + element_koji_delimo.charAt(j);
                   }

               }
               brojac_index++;
               novi_brojac++;
               lista_unosa.add(brojac_index, novi_element);

           }
           lista_unosa.remove(pocetni_unos);

       }


    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String unos= scanner.nextLine();

        ArrayList<String> lista_unos=new ArrayList<>();
        unesi_listu(lista_unos,unos);
        while (true){

            String komanda=scanner.nextLine();
            if (komanda.equals("3:1")){
                break;
            }
            String [] delovi_komande=komanda.split(" ");


            String operacija=delovi_komande[0];
            int pocetni_unos=Integer.parseInt(delovi_komande[1]);
            int krajnji_unos=Integer.parseInt(delovi_komande[2]);

            switch (operacija){
                case "merge":
                    merge(lista_unos,pocetni_unos,krajnji_unos);
                    break;
                case "divide":
                    divide(lista_unos,pocetni_unos,krajnji_unos);
                    break;
            }
        }
        ispisiListu(lista_unos);

    }
}
