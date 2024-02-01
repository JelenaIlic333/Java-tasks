import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String tablice = "";

        LinkedHashMap<String, String> automobiliTablice = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String komanda = scanner.nextLine();
            String[] delovi = komanda.split(" ");
            String nazivKomande = delovi[0];
            String username = delovi[1];

            if (nazivKomande.equals("register")) {
                tablice = delovi[2];

                if (!automobiliTablice.containsKey(username)) {
                    System.out.printf("%s registered %s successfully\n", username, tablice);
                    automobiliTablice.put(username, tablice);
                } else {
                    String tabliceTrazene = automobiliTablice.get(username);
                    System.out.printf("ERROR: already registered with plate number %s\n", tabliceTrazene);
                }
            } else {
                if (automobiliTablice.containsKey(username)) {
                    System.out.printf("%s unregistered successfully\n", username);
                    automobiliTablice.remove(username);
                } else System.out.printf("ERROR: user %s not found\n", username);{

                }
            }
        }
        for (Map.Entry<String, String> element: automobiliTablice.entrySet()){
            String trenutniUsername=element.getKey();
            String trenutniTablice= element.getValue();
            System.out.printf("%s => %s\n", trenutniUsername, trenutniTablice);
        }
    }
}
