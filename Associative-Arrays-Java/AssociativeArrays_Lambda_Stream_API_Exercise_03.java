import java.util.LinkedHashMap;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LinkedHashMap<String, Double[]> proizvodiKolicineCena= new LinkedHashMap<>();

        while (true){
            String unos=scanner.nextLine();

            if (unos.equals("buy")) break;
            String [] deloviUnosa= unos.split(" ");
            String naziv=deloviUnosa[0];
            double cena=Double.parseDouble(deloviUnosa[1]);
            double kolicina=Double.parseDouble(deloviUnosa[2]);

            if (!proizvodiKolicineCena.containsKey(naziv)){
                proizvodiKolicineCena.put(naziv, new Double[] {0.0, 0.0});
            }
            double staraKolicina=proizvodiKolicineCena.get(naziv)[1];
            proizvodiKolicineCena.put(naziv, new Double[] {cena,staraKolicina + kolicina});
    }

        proizvodiKolicineCena
                .entrySet()
                .stream()
                .forEach(element-> System.out.printf("%s -> %.2f\n", element.getKey(), element.getValue()[0]
                * element.getValue()[1]));


}}
