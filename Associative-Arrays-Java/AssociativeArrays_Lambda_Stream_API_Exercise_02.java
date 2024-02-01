import java.util.LinkedHashMap;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        LinkedHashMap<String , Integer> resursiKolicine=new LinkedHashMap<>();

        while (true){
            String resurs= scanner.nextLine();

            if (resurs.equals("stop")){
                break;
            }
            int kolicinaTrenutna=Integer.parseInt(scanner.nextLine());
            if (!resursiKolicine.containsKey(resurs)){
                resursiKolicine.put(resurs, 0);
            }
            int trenutnaKolicinaResursa=resursiKolicine.get(resurs);

            resursiKolicine.put(resurs, trenutnaKolicinaResursa + kolicinaTrenutna);
        }

        resursiKolicine
                .entrySet()
                .stream()
                .forEach(element -> System.out.printf("%s -> %d\n", element.getKey(), element.getValue()));

//        resursiKolicine.entrySet().forEach(element-> System.out.printf("%s -> %d\n", element.getKey(),
//                element.getValue()));
    }
}
