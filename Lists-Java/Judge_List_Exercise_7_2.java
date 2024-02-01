import java.util.ArrayList;
import java.util.Scanner;

public class Judge_List_Exercise_7_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String tekst = scanner.nextLine();
        String[] delovi = tekst.split("\\|");
        ArrayList<String> listaNizovaStringovi = new ArrayList<>();

        for (String deo : delovi){
            listaNizovaStringovi.add(deo);
        }
        ArrayList<String> rezultat = new ArrayList<>();

        for (int i = listaNizovaStringovi.size()-1; i>=0 ;i--) {
            String s = listaNizovaStringovi.get(i);

            String[] deloviNiza = s.split(" ");

            for (String el : deloviNiza) {
                if (!el.equals("")){
                    rezultat.add(el);
                }

            }
        }

        for (String broj : rezultat) {
            System.out.printf("%s ", broj);
        }
    }
}
