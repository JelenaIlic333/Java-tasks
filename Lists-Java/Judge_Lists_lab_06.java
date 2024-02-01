import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Judge_Lists_lab_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int broj_unosa=Integer.parseInt(scanner.nextLine());
        String unos;
        ArrayList<String> lista=new ArrayList<>();

        for (int i=0; i<broj_unosa; i++){
            lista.add(scanner.nextLine());
        }

        Collections.sort(lista);

        for(int i=0; i<lista.size(); i++){
            System.out.printf("%d.%s\n", i + 1, lista.get(i));
        }


    }

}


