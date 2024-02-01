import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_09 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String, ArrayList<String> >stranaIme=new LinkedHashMap<>();

        while (true){
            String unos=scanner.nextLine();

            if (unos.equals("Lumpawaroo"))break;

            String [] delovi_unosa=unos.split(" ");

            String operacija=delovi_unosa[1];


            if (operacija.equals("|")){
                String strana=delovi_unosa[0];
                String ime=delovi_unosa[2];
                if (!stranaIme.containsKey(strana)){
                    stranaIme.put(strana, new ArrayList<>());
                    stranaIme.get(strana).add(ime);

                } else if (stranaIme.containsKey(ime)){
                    stranaIme.get(strana).add(ime);
                }


            } else if (delovi_unosa[1].equals("->")){
                String ime=delovi_unosa[0];
                String strana=delovi_unosa[2];
                if (!stranaIme.containsKey(strana)){
                    stranaIme.put(strana, new ArrayList<>());
                    stranaIme.get(strana).add(ime);
                } else if (stranaIme.containsValue(ime)){
                    stranaIme.get(strana).remove(ime);
                    stranaIme.get(ime);
                }


            }

        }

        for (Map.Entry<String , ArrayList<String>> element : stranaIme.entrySet()){


        }
    }
}
