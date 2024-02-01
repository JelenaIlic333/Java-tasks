import java.util.LinkedHashMap;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_Exercise_07_klase {
    public static class Kolicina {
        public int kolicina_broj;
        public String materijal;


        public void Kolicina(int kolicina_broj, String materijal) {
            this.kolicina_broj = kolicina_broj;
            this.materijal = materijal;

        }

//        public int izracunatiUkupnoKolicinu(){
//            return this.kolicina_broj *
//        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        LinkedHashMap<Kolicina, String > kolicineMaterjala=new LinkedHashMap<>();

        while (true){
            String unos=scanner.nextLine();
            String[] delovi=unos.split(" ");
            int kolicina_broj=Integer.parseInt(delovi[0]);
            String materijal=delovi[1];
            if (!kolicineMaterjala.containsKey(materijal)){
                Kolicina novaKolicina=new Kolicina();
            }
        }
    }
}
