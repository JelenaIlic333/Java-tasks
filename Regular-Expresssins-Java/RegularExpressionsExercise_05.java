import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExercise_05 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
      //M3ph-0.5s-0.5t0.0**
        String unos=scanner.nextLine();

        Pattern regex=Pattern.compile("(?<health>[A-Za-z+])(?<damage>[0-9\\.\\-\\+]*+)(?<grupa>[\\*\\/]*+)");
        ArrayList<String> imena=new ArrayList<>();
        ArrayList<Double> cifra=new ArrayList<>();
        ArrayList<String> grupaOperatora=new ArrayList<>();

        for (String s : unos.split(", | \\s*")) imena.add(s);

        for (String s : imena) {

            Matcher matcherSlova = regex.matcher(s);

            int ukupanZbir=0;
            double ukupanDamage=0;

        while (matcherSlova.find()) {
            String demoni = matcherSlova.group("health");
            //imena.add(demoni);
           // int health = Integer.parseInt(demoni);


            for (int i=0; i<demoni.length(); i++){
                int zbir=demoni.charAt(i);
                ukupanZbir=ukupanZbir + zbir;
            }
        }

            Matcher matcherCifre=regex.matcher(s);
            while (matcherCifre.find()){
                String cifre=matcherCifre.group("damage");
                if (cifre.equals("")){
                    continue;
                }
                double cifraBroj=Double.parseDouble(cifre);
                cifra.add(Double.valueOf(cifraBroj));
                ukupanDamage=  ukupanDamage + cifraBroj;
        }

            Matcher matcherOperator=regex.matcher(s);
            while (matcherOperator.find()){
                String operator=matcherOperator.group("grupa");
//                grupaOperatora.add(operator);
                for (int i=0; i < operator.length(); i++) {

                    if (operator.charAt(i)==('*')) {
                        ukupanDamage = ukupanDamage * 2;
                    } else if (operator.charAt(i)==('/')){
                        ukupanDamage = ukupanDamage / 2;
                    }
                }

            }
            System.out.printf("%s - %d health, %.2f damage\n", s, ukupanZbir, ukupanDamage);

              }

          }


    }

