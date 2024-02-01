import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AssociativeArrays_Lambda_Stream_API_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split(" "))
                .filter(element-> element.length() % 2 == 0)
                .forEach(element -> System.out.println(element));

    }

}
