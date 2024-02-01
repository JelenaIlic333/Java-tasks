import java.math.BigInteger;
import java.util.Scanner;

public class Objects_and_Classes_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BigInteger prvi_broj=new BigInteger(scanner.nextLine());
        BigInteger drugi_broj=new BigInteger(scanner.nextLine());

        BigInteger zbir=prvi_broj.add(drugi_broj);

        System.out.println(zbir);

    }
}
