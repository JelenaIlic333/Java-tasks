import java.util.Scanner;

public class StringLabExercise_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String unos=scanner.nextLine();

        for (int i=0; i< unos.length(); i++){
            String trenutniKarakter=unos.charAt(i) + "";
            String dupliKarakter=String.format("%s%s", trenutniKarakter, trenutniKarakter);

            while (unos.contains(dupliKarakter)){
                unos=unos.replace(dupliKarakter,trenutniKarakter);
            }
        }
        System.out.println(unos);
    }
}
