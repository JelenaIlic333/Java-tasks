import java.util.Scanner;

public class StringLab_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // posto unosimo iz konzole

        String recKojuMenjam = scanner.nextLine();
        String tekst = scanner.nextLine();

        while (tekst.contains(recKojuMenjam)){ /// i to ponavljam sve dok se ta rec nalazi u tekstu
            String[] deloviTeksta = tekst.split(recKojuMenjam); /// rastavio sam string po toj reci
            /// sto ce mi vratiti listu delova koji su podelili tekst po ovoj reci
            /// ananas  => "n" => [ "a", "a", "as" ]
            tekst = String.join("", deloviTeksta); /// spojim ih po praznom stringu

        }
        System.out.println(tekst);
    }
}
