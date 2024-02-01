import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions_Lab_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String unos=scanner.nextLine();
        Pattern regex=Pattern.compile("\\+359([ -])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher=regex.matcher(unos);

        ArrayList<String> svaResenja=new ArrayList<>();


        while (matcher.find()) {
            String rez = matcher.group();
            svaResenja.add(rez);
        }
            String finale = String.join(", ", svaResenja);
            System.out.println(finale);

    }
}
