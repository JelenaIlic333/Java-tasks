import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StringLabExercise_01 {

    public static boolean isValidUsername(String username){
        int n=username.length();
        if (n<3 || n>16) return false;
        for (int i=0; i<n; i++){
            char trenutniKarakter=username.charAt(i);
            if (!Character.isLetterOrDigit(trenutniKarakter) && trenutniKarakter !='_' && trenutniKarakter !='-'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> usernameList= (ArrayList<String>)
                Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        for (String s : usernameList){
            if (isValidUsername(s)){
                System.out.println(s);
            }
        }
    }
}
