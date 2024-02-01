import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_lab_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tekst=scanner.nextLine();
        String [] delovi=tekst.split(" ");
        int n= delovi.length;
        ArrayList<Double>brojevi=new ArrayList<>();
        for (int i=0; i<n; i++){
            double trenutni_element=Double.parseDouble(delovi[i]);
            brojevi.add(trenutni_element);
        }

        for (int i=0; i<brojevi.size()-1; i++){
            double trenutni=brojevi.get(i);
            double sledeci=brojevi.get(i + 1);

            if (trenutni==sledeci){
                brojevi.set(i, trenutni + sledeci);
                brojevi.remove(i+1);
                i=i-2;
                if (i<1) i= -1;
            }
        }
        DecimalFormat df=new DecimalFormat("#.#");

        for (int j=0; j< brojevi.size(); j++){
            String trenutni=df.format(brojevi.get(j));
            System.out.printf("%s ", trenutni);
        }
    }
}
