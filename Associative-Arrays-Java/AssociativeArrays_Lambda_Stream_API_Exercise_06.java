import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_06 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String , ArrayList<Double> > oceneUcenika=new LinkedHashMap<>();

        for (int i=1; i<=n; i++){
            String imeUcenika=scanner.nextLine();
            double ocena=Double.parseDouble(scanner.nextLine());

            if(!oceneUcenika.containsKey(imeUcenika)) {
                oceneUcenika.put(imeUcenika, new ArrayList<Double>());
                oceneUcenika.get(imeUcenika).add(ocena);
            }

            else if (oceneUcenika.containsKey(imeUcenika)) {
                oceneUcenika.get(imeUcenika).add(ocena);
            }

        }
        for (Map.Entry<String, ArrayList<Double>> element : oceneUcenika.entrySet()){
            String nazivUcenikaTrenutno = element.getKey();
            ArrayList<Double> trenutneOcene = element.getValue();
            double zbirOcena=0;
            for (Double s : trenutneOcene ) {
                zbirOcena=zbirOcena + s;
            }
            double prosecnaOcena=zbirOcena / trenutneOcene.size();
            if (prosecnaOcena >= 4.5){
                System.out.printf("%s -> %.2f\n", nazivUcenikaTrenutno, prosecnaOcena);
            }
        }
    }
}
