import java.util.Scanner;

public class StringLab_01 {

    public static StringBuilder okreniString(String tekst) {
        int n = tekst.length();
        StringBuilder sb = new StringBuilder("");
        for (int i = n - 1; i >= 0; i--) {
            char trenutni = tekst.charAt(i);
            sb.append(trenutni);
        }
        return sb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String unos = scanner.nextLine();

            if (unos.equals("end")) break;

            System.out.printf("%s = %s\n", unos, okreniString(unos));
        }
    }
}
