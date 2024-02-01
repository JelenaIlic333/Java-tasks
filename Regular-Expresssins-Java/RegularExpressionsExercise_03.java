import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsExercise_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Pattern regex=Pattern
                .compile("%(?<nazivMusterije>[A-Z][a-z]+)%[^\\|\\$\\.%]*?<(?<nazivProizvoda>\\w+)>[^|$.%]*?\\|(?<kolicina>[0-9]+)\\|[^|$.%]*?(?<cena>[0-9\\.]+)\\$");
        double totalSuma=0;

        while (true){
            String unos=scanner.nextLine();
            if (unos.equals("end of shift"))break;

            Matcher matcher=regex.matcher(unos);
            if (matcher.find()){
                String nazivMusterije= matcher.group("nazivMusterije");
                String nazivProizvoda=matcher.group("nazivProizvoda");
                int kolicina=Integer.parseInt(matcher.group("kolicina"));
                double cena=Double.parseDouble(matcher.group("cena"));
                double punaCena=cena * kolicina;

                System.out.printf("%s: %s - %.2f\n", nazivMusterije, nazivProizvoda, punaCena);

                totalSuma = totalSuma + punaCena;
            }

        }

        System.out.printf("Total income: %.2f",totalSuma);

    }
}
