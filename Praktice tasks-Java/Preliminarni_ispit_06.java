import java.util.Scanner;

public class Preliminarni_ispit_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int prva_cifra_prvog_broja=Integer.parseInt(scanner.nextLine());
        int druga_cifra_prvog_broja=Integer.parseInt(scanner.nextLine());
        int prva_cifra_drugog_broja=Integer.parseInt(scanner.nextLine());
        int druga_cifra_drugog_broja=Integer.parseInt(scanner.nextLine());
        int brojac=0;
        for ( int k=prva_cifra_prvog_broja; k<=8; k++){
            for (int l=9; l>=druga_cifra_prvog_broja; l--){
                for (int m=prva_cifra_drugog_broja; m<=8; m++){
                    for (int n=9; n>=druga_cifra_drugog_broja; n--){
                        if (k % 2==0 && m % 2 ==0 && l % 2 !=0 && n % 2 !=0){
                            if (k != m || l != n){
                                brojac++;
                                System.out.printf("%d%d - %d%d\n", k,
                                        l, m, n);
                                if (brojac >=6){
                                    return;
                                }
                            }else {
                                System.out.println("Cannot change the same player.");
                            }


                        }
                    }
                }
            }

        }
    }
}
