import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AssociativeArrays_Lambda_Stream_API_01 {

    static void ispisiMapu(TreeMap<Double, Integer> mapa){
        for (Map.Entry<Double,Integer> entry : mapa.entrySet()){
            double trenutniBroj=entry.getKey();
            int brojPonavljanjaTrenutnogBroja=entry.getValue();
            System.out.printf("%.0f -> %d\n", trenutniBroj, brojPonavljanjaTrenutnogBroja);
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double[] nums= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double :: parseDouble).toArray();
        TreeMap<Double, Integer> ponavljanjeBrojeva=new TreeMap<>();

        for (double broj : nums){
            if (! ponavljanjeBrojeva.containsKey(broj)){
                ponavljanjeBrojeva.put(broj,1);
            }else {
                int trenutnoStanje=ponavljanjeBrojeva.get(broj);
                ponavljanjeBrojeva.put(broj, trenutnoStanje + 1);
            }
        }
        ispisiMapu(ponavljanjeBrojeva);
    }
}
