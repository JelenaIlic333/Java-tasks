import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExercise_02 {
//    public static void ispisiMapu(LinkedHashMap<String, Integer> mapa){
//        for (Map.Entry<String,Integer> parKljucVrednost : mapa.entrySet()){
//            String kljuc = parKljucVrednost.getKey();
//            int vrednostDistance = parKljucVrednost.getValue();
//            System.out.printf("%s => %d\n", kljuc, vrednostDistance);
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String unos=scanner.nextLine();

        ArrayList<String> imenaTakmicara=new ArrayList<>();

        for (String s : unos.split(", "))imenaTakmicara.add(s);
        LinkedHashMap<String, Integer> rezultati=new LinkedHashMap<>();

        for (String ime : imenaTakmicara){
            rezultati.put(ime, 0);
        }
        Pattern regexSlovo=Pattern.compile("[a-zA-Z]");
        Pattern regexCifre=Pattern.compile("[0-9]");

        while (true){
            String red=scanner.nextLine();

            if (red.equals("end of race")) break;

            Matcher matcherSlova=regexSlovo.matcher(red);
            StringBuilder sbZaIme=new StringBuilder();

            while (matcherSlova.find()){
                String trenutnoPoklapanje=matcherSlova.group();
                sbZaIme.append(trenutnoPoklapanje);
            }

            Matcher matcherZaCifre=regexCifre.matcher(red);
            int suma=0;
            StringBuilder sbCifre=new StringBuilder();

            while (matcherZaCifre.find()){
                String trenutnoPoklapanje=matcherZaCifre.group();
                suma=suma + Integer.parseInt(trenutnoPoklapanje);
                sbCifre.append(trenutnoPoklapanje);
            }

            String kljucIme=sbZaIme.toString();
            if (rezultati.containsKey(kljucIme)){
                int trenutnaVrednost=rezultati.get(kljucIme);
                rezultati.put(kljucIme, trenutnaVrednost+suma);
            }
        }
        List<String> sortiraniTakmicariOdNajboljeg=rezultati.entrySet()
                .stream()
                .sorted((a,b)->Integer.compare(b.getValue(), a.getValue()))
                        .map(Map.Entry :: getKey).toList();

        System.out.printf("1st place: %s\n", sortiraniTakmicariOdNajboljeg.get(0));
        System.out.printf("2nd place: %s\n", sortiraniTakmicariOdNajboljeg.get(1));
        System.out.printf("3rd place: %s\n", sortiraniTakmicariOdNajboljeg.get(2));
    }
}
