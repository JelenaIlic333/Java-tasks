import java.util.Scanner;

public class StringLabExercise_04 {

    public static String enkriptujCezarovKodSa3(char s){
        char noviKarakter=(char) ((int)s + 3);
        return noviKarakter + "";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String unos=scanner.nextLine();
        StringBuilder sb=new StringBuilder();

        for (char karakter : unos.toCharArray()){
            String sifrovano=enkriptujCezarovKodSa3(karakter);
            sb.append(sifrovano);
        }
        System.out.println(sb);
    }
}
