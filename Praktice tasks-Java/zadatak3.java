import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class zadatak3 {

    public static void unesiUListu(ArrayList<String> listaProizvoda, String proizvodi){
        String[] nizProizvoda=proizvodi.split(",");
        int n=nizProizvoda.length;

        for (int i=0; i<n; i++){
            listaProizvoda.add(proizvodi);
        }

    }

    public static void add(LinkedHashMap<String,ArrayList<String>> spisak, String prodavnica, ArrayList<String> listaProizvoda){

        if (spisak.containsKey(prodavnica)){
            spisak.get(prodavnica).add(String.valueOf(listaProizvoda));
        }else if (!spisak.containsKey(prodavnica)){
            spisak.put(prodavnica, new ArrayList<>());
            spisak.get(prodavnica).add(String.valueOf(listaProizvoda));
        }

        for (int i=0; i<listaProizvoda.size(); i++) {
            String proizvod=listaProizvoda.get(i);
            if (!listaProizvoda.contains(proizvod)){
                listaProizvoda.add(proizvod);
            }
        }
    }

    public static void important(LinkedHashMap<String,ArrayList<String>> spisak, String prodavnica, ArrayList<String> listaProizvoda, String proizvod){

        if (spisak.containsKey(prodavnica)){
            spisak.get(prodavnica).add(String.valueOf(listaProizvoda));
        }else if (!spisak.containsKey(prodavnica)){
            spisak.put(prodavnica, new ArrayList<>());
            spisak.get(prodavnica).add(String.valueOf(listaProizvoda));
        }
        for (int i=0; i<listaProizvoda.size(); i++){
//            String artikal= listaProizvoda.get(i);
            if (!listaProizvoda.contains(proizvod)){
                listaProizvoda.add(0, proizvod);
            }

        }

    }
    public static void ukloni(LinkedHashMap<String,ArrayList<String>> spisak, String prodavnica){
       for (int i=0; i<spisak.size(); i++){
       if (spisak.containsKey(prodavnica)){
           spisak.remove(prodavnica);
       }
       }
    }
    public static void ispisi(LinkedHashMap<String, ArrayList<String>> spisak){
        for (Map.Entry<String,ArrayList<String>> kljucVrednost : spisak.entrySet()){
            String prodavnica=kljucVrednost.getKey();
            ArrayList<String> proizvodi=kljucVrednost.getValue();
            System.out.printf("%s: ",prodavnica);
            for (int i=0; i<prodavnica.length(); i++){
                String artikal=proizvodi.get(i);
                System.out.printf(" - %s", artikal);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        while (true){

            String unos=scanner.nextLine();
            String[] deloviUnosa=unos.split("->");
            String komada=deloviUnosa[0];

            if (komada.equals("Go Shopping")){
                break;
            }

            LinkedHashMap<String, ArrayList<String>> spisak=new LinkedHashMap<>();
            String prodavnica=deloviUnosa[1];
            String proizvodi=deloviUnosa[2];

            ArrayList<String> listaProizvoda=new ArrayList<>();

            listaProizvoda.add(proizvodi);
            spisak.put(prodavnica,listaProizvoda);


            if (komada.equals("Add")){  //⦁	"Add->{Store}->{Item},{Item1},…{ItemN}"

                add(spisak,prodavnica,listaProizvoda);

            } else if (komada.equals("Important")){ //⦁	"Important->{Store}->{Item}"
               important(spisak,prodavnica,listaProizvoda,proizvodi);


            } else if (komada.equals("Remove")){ //⦁	"Remove->{Store}"
                  ukloni(spisak,prodavnica);

            }
        }

    }
}
