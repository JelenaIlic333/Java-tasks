import java.util.Scanner;

public class StringLabExercise_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String putanja=scanner.nextLine();
        String[] deloviPutanje=putanja.split("\\\\");
        int n=deloviPutanje.length;
        String poslednji=deloviPutanje[n-1];
        String[] deloviPoslednjeg=poslednji.split("\\.");
        String nazivFajla=deloviPoslednjeg[0];
        String ekstenzija=deloviPoslednjeg[1];
        System.out.printf("File name: %s\n", nazivFajla);
        System.out.printf("File extension: %s\n", ekstenzija);

    }
}
