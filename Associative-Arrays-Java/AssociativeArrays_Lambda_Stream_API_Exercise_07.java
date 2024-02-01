import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AssociativeArrays_Lambda_Stream_API_Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int ukupnaKolicina=0;
        TreeMap< String, Integer[] > sviMaterjali=new TreeMap<>();

        while (true){
            String unos=scanner.nextLine();
            String[] delovi=unos.split(" ");
            int broj;
            String materijal="";
            for(int i=0; i<delovi.length; i++){
                if (i % 2 ==0){
                    broj=Integer.parseInt(delovi[i]);
                }else {
                     materijal=delovi[i];
                }
            }


            if(materijal.equals("Shadowmourne") || materijal.equals("Valanyr") || materijal.equals("Dragonwrath")){
                sviMaterjali.put( materijal, new Integer[]{});
//                sviMaterjali.put(materijal, broj);
              // int staraKolicina=sviMaterjali.get(materijal)[0];
//                sviMaterjali.put( new Integer[]{ukupnaKolicina, staraKolicina + broj}, materijal);

            }if (materijal.equals("Shards") || materijal.equals("Fragments") || materijal.equals("Motes")){
                for (String rec : delovi){
                    String malaSlova=rec.toLowerCase();
//                    int staraKolicina=sviMaterjali.get(materijal)[0];
//                    sviMaterjali.put( new Integer[]{ukupnaKolicina, staraKolicina + broj},materijal);
                }
            }

//             ukupnaKolicina=ukupnaKolicina + broj;

//                for (Map.Entry<String, Integer[]> element : sviMaterjali.entrySet()) {
//                    String pobednickiMaterijal = element.getKey();
//                    if (ukupnaKolicina>=250) {
//                    System.out.printf("%s !", pobednickiMaterijal);
//                }
//                    System.out.printf("%s: %d", pobednickiMaterijal, ukupnaKolicina);
//            }
       }
    }
}
