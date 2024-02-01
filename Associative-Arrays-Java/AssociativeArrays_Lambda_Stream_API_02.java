import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_02 {

    public static void ispisiListu(ArrayList<String> list){
        for (int i=0; i< list.size(); i++){
            if (i !=list.size() -1){
                System.out.printf("%s, ", list.get(i));
            }else {
                System.out.printf("%s\n", list.get(i));
            }
        }
    }

    public static void ispisiMapu(LinkedHashMap<String, ArrayList<String>> mapaZaIspis){
        for (Map.Entry<String, ArrayList<String >> unos : mapaZaIspis.entrySet()){
            String pojam= unos.getKey();
            ArrayList<String> listaSinonima= unos.getValue();
            System.out.printf("%s - ", pojam);
            ispisiListu(listaSinonima);
        }
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String >> pojmoviSaSinonimima=new LinkedHashMap<>();

        for (int i=1; i<=n; i++) {
            String pojam = scanner.nextLine();
            String sinonim = scanner.nextLine();

            pojmoviSaSinonimima.putIfAbsent(pojam, new ArrayList<>());

            pojmoviSaSinonimima.get(pojam).add(sinonim);
        }
        ispisiMapu(pojmoviSaSinonimima);
    }
}
