import java.util.LinkedHashMap;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String unos=scanner.nextLine();
        LinkedHashMap<String, Integer> slovaPonavljanja=new LinkedHashMap<>();
        for (int i=0; i< unos.length(); i++){
            String trenutniKarakter=unos.charAt(i) + "";
            if (!trenutniKarakter.equals(" ")){
                slovaPonavljanja.putIfAbsent(trenutniKarakter, 0);
                int trenutnaVrednost=slovaPonavljanja.get(trenutniKarakter);
                slovaPonavljanja.put(trenutniKarakter, trenutnaVrednost + 1);
            }
        }
        slovaPonavljanja
                .entrySet()
                .stream()
                .forEach(element -> System.out.printf("%s -> %d\n",element.getKey(), element.getValue()));
    }
}
