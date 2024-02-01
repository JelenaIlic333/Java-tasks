import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions_Lab_03 {
    public static void main(String[] args) {
        Pattern regex=Pattern
                .compile("\\b(?<dan>\\d{2})(?<separator>[-\\/\\.])(?<mesec>[A-Z][a-z]{2})\\2(?<godina>\\d{4})\\b");

        Scanner scanner=new Scanner(System.in);
        String unos=scanner.nextLine();
        Matcher matcher=regex.matcher(unos);

        while (matcher.find()){
            String dan=matcher.group("dan");
            String mesec=matcher.group("mesec");
            String godina=matcher.group("godina");

            System.out.printf("Day: %s, Month: %s, Year: %s\n", dan,mesec,godina);
        }
    }
}
