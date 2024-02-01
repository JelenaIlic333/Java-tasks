import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_zadatak02 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int brojNiza=Integer.parseInt(scanner.nextLine());
        Pattern pattern=Pattern.compile("!([A-Z][a-z]{3,})!:\\[(\\w{8,})\\]");

        for (int i=0; i<brojNiza; i++){
            String ulaz=scanner.nextLine();

            Matcher matcher=pattern.matcher(ulaz);

            if (matcher.find()){
                String komanda=matcher.group(1);
                String pretvori=matcher.group(2);
             char[] nizKaraktera=pretvori.toCharArray();
                System.out.printf("%s: ", komanda);
             for (int j=0; j<=nizKaraktera.length-1; j++){
                 int karakteri=pretvori.charAt(j);
                 System.out.printf("%d ", karakteri);

             }
                System.out.println();

            }else{
                System.out.println("The message is invalid");

            }


        }


    }
}
