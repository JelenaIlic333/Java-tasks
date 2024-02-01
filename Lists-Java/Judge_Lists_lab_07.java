import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Judge_Lists_lab_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String tekst=scanner.nextLine();
        String [] brojeviKaoTekst=tekst.split(" ");

        ArrayList<Integer> brojevi=new ArrayList<>();

        for (int i=0; i<brojeviKaoTekst.length; i++) {
            brojevi.add(Integer.parseInt(brojeviKaoTekst[i]));
        }

        for (int i=0; i<brojevi.size(); i++){
            int broj=brojevi.get(i);
            if (broj<0){
                brojevi.remove(i);
                i--;
            }
        }
//        brojevi.removeIf(x -> x<0);


        if (brojevi.isEmpty()){
            System.out.println("empty");
        }else {
            Collections.reverse(brojevi);
            for (int broj:brojevi){
                System.out.printf("%d ", broj);
            }
        }

    }
}
