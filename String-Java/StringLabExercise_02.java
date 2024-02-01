import java.util.Scanner;

public class StringLabExercise_02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String [] unos=scanner.nextLine().split(" ");
        String prviTekst=unos[0];
        String drugiTekst=unos[1];

        int n1=prviTekst.length();
        int n2=drugiTekst.length();

        int manjaDuzina, vecaDuzina;

        if (n1 > n2){
            manjaDuzina=n2;
        }else {
            manjaDuzina=n1;
        }

        int zbir=0;

        for (int i=0; i<manjaDuzina; i++){
            char izPrvogTrenutni=prviTekst.charAt(i);
            char izDrugogTRenutni=drugiTekst.charAt(i);
            int prviVrednostUnicode=(int)izPrvogTrenutni;
            int drugiVrednostUnicode=(int)izDrugogTRenutni;

            int proizvod=prviVrednostUnicode * drugiVrednostUnicode;
            zbir=zbir + proizvod;
        }

        for (int i = manjaDuzina; i < n1; i++){
            zbir = zbir + (int) prviTekst.charAt(i);

        }

        for (int i = manjaDuzina; i < n2; i++){
            zbir = zbir + (int) drugiTekst.charAt(i);
        }
        System.out.println(zbir);
    }
}
