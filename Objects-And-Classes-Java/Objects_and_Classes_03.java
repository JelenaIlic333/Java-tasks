import java.math.BigDecimal;
import java.util.Scanner;

public class Objects_and_Classes_03 {
    public static int faktorijel(int broj){
        int proizvod=1;
        for (int i=1; i<=broj; i++){
            proizvod=proizvod * i;
        }
        System.out.printf("%d!=%d\n", broj,proizvod);
        return proizvod;
    }

    public static BigDecimal faktorijalPrecizno(int broj){
        BigDecimal proizvod=new BigDecimal("1");
        for (int i=1; i<=broj; i++){
            BigDecimal bigDecimalTrenutnoI=new BigDecimal(i);
            proizvod=proizvod.multiply(bigDecimalTrenutnoI);
        }
        return proizvod;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int broj=Integer.parseInt(scanner.nextLine());
        BigDecimal rez=faktorijalPrecizno(broj);
        System.out.println(rez);
    }
}
