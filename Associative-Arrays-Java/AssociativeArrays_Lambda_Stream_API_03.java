import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] reci= scanner.nextLine().split(" ");

        LinkedHashMap<String , Integer> brojPonavljanjaReci= new LinkedHashMap<>();

        for (String rec : reci){
            String malimSlovima= rec.toLowerCase();
            if (!brojPonavljanjaReci.containsKey(malimSlovima)){
                brojPonavljanjaReci.put(malimSlovima, 1);
            }else {
                int trenutniBrojPonavljanja= brojPonavljanjaReci.get(malimSlovima);
                brojPonavljanjaReci.put(malimSlovima, trenutniBrojPonavljanja + 1);
            }
        }
        ArrayList<String> resenja=new ArrayList<>();

        for (Map.Entry<String , Integer> parRecPonavljanja : brojPonavljanjaReci.entrySet()){
            String trenutnaRec= parRecPonavljanja.getKey();
            int brojPonavljanjaTrenutneReci= parRecPonavljanja.getValue();

            if (brojPonavljanjaTrenutneReci % 2 !=0){
                resenja.add(trenutnaRec);
            }
        }

        for (int i=0; i<resenja.size(); i++){
            String s=resenja.get(i);
            if (i == resenja.size() - 1){
                System.out.print(s);
            }else {
                System.out.print(s + ", ");
            }
        }
    }
}
