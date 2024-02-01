import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_05 {
//     static void ispisiListuStudenata(LinkedHashMap<String, String> kurseviStudenati){
//         for (Map.Entry<String , String> element : kurseviStudenati.entrySet()){
//             String trenutniKurs=element.getKey();
//             int brojacStudenata=1;
//             System.out.printf("%s : %d\n", trenutniKurs, kurseviStudenati);
//             for (int i=0; i<brojacStudenata; i++){
//                 String sviStudenti=studenti.get(i);
//                 System.out.printf("-- %s\n", sviStudenti);
//
//             }
//             String trenutniStudent=element.getValue();
//
//
//         }
//     }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String , ArrayList<String> > kurseviStudenti=new LinkedHashMap<>();
//        int brojacStudenata=1;
//        ArrayList<String > studenti=new ArrayList<>();

        while (true){
            String unos=scanner.nextLine();
            if (unos.equals("end")){
                break;
            }
            String [] delovi=unos.split(" : ");
            String nazivKursa=delovi[0];
            String imeStudenata=delovi[1];

            if (!kurseviStudenti.containsKey(nazivKursa)){
                kurseviStudenti.put(nazivKursa, new ArrayList<>());
                kurseviStudenti.get(nazivKursa).add(imeStudenata);
//                studenti.add(imeStudenata);

            }else {
                if (kurseviStudenti.containsKey(nazivKursa)){
//                    brojacStudenata++;
                    kurseviStudenti.get(nazivKursa).add(imeStudenata);
//                    studenti.add(imeStudenata);
                }


            }
        }
        for (Map.Entry<String , ArrayList<String>> element : kurseviStudenti.entrySet()){
            String trenutniKurs=element.getKey();
            ArrayList<String > studenti=element.getValue();
            System.out.printf("%s: %d\n", trenutniKurs, studenti.size());

            for (int i=0; i<studenti.size(); i++){
//                String sviStudenti=studenti.get(i);
                System.out.printf("-- %s\n", studenti.get(i));

            }
//            String trenutniStudent=element.getValue();


        }

    }
}
