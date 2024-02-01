import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String , ArrayList<String > >firmaZaposleni=new LinkedHashMap<>();

        while (true){
            String unos=scanner.nextLine();
            if (unos.equals("End")){
                break;
            }
            String [] deloviUnosa=unos.split(" -> ");
            String imeFirme=deloviUnosa[0];
            String id=deloviUnosa[1];

            if (!firmaZaposleni.containsKey(imeFirme)){
                firmaZaposleni.put(imeFirme, new ArrayList<String>());

            }
            if (!firmaZaposleni.get(imeFirme).contains(id)){
                firmaZaposleni.get(imeFirme).add(id);
            }

        }
        for (Map.Entry<String, ArrayList<String>> element : firmaZaposleni.entrySet()){
            String nazivFirmeTrenutni = element.getKey();
            ArrayList<String> trenutniNizIdZaposlenih = element.getValue();
            System.out.println(nazivFirmeTrenutni);
            for (String id : trenutniNizIdZaposlenih ) {
                System.out.printf("-- %s\n", id);
            }
        }
    }
}
