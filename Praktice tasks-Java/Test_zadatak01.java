import java.util.Scanner;

public class Test_zadatak01 {

    public static void validacija(String sifra) {
        int n = sifra.length();

        if (n < 8) {
            System.out.println("Password must be at least 8 characters long!");
        }
        boolean jednoVelikoSlovo = false;
        boolean jednoMaloSlovo=false;
        boolean jedanBroj=false;
        for (int i = 0; i < n; i++) {
            char trenutniKarakter = sifra.charAt(i);

            if (!Character.isLetterOrDigit(trenutniKarakter) && trenutniKarakter != '_') {
                System.out.printf("Password must consist only of letters, digits and _!");
            } else if (Character.isUpperCase(trenutniKarakter)) {
                jednoVelikoSlovo = true;
            } else if (Character.isLowerCase(trenutniKarakter)){
                jednoMaloSlovo=true;
            } else if (Character.isDigit(trenutniKarakter)){
                jedanBroj=true;

            }
        }
        if (!jednoVelikoSlovo) {
            System.out.printf("Password must consist at least one uppercase letter!\n");
        } else if (!jednoMaloSlovo){
            System.out.printf("Password must consist at least one lowercase letter!\n");
        } else if (!jedanBroj){
            System.out.printf("Password must consist at least one digit!\n");

        }
    }

    public static String velikoSlovo(String sifra, int pozicija){
        StringBuilder sb=new StringBuilder(sifra);
//        for (int i=0; i< sifra.length(); i++){
//            if (i==pozicija){
//               // sb.append(Character.UPPERCASE_LETTER);
//                //sb.append(Character.isUpperCase(i));
//                sb.append(Character.toUpperCase(i));
//            }
//        }
        if (pozicija<sifra.length()) {
//            sb.append(Character.toUpperCase(pozicija));
            sb.replace(pozicija,pozicija+1, String.valueOf(Character.toUpperCase(sifra.charAt(pozicija))));
        }
        return sb.toString();
    }

    public static String maloSlovo(String sifra, int pozicija){
        StringBuilder sb=new StringBuilder(sifra);
        for (int i=0; i< sifra.length()-1; i++){
            if (i==pozicija){
                // sb.append(Character.UPPERCASE_LETTER);
                sb.replace(i, i+1, String.valueOf(Character.toLowerCase(sifra.charAt(i))));
            }
        }
        return sb.toString();

    }

    public static String insert(String sifra, String karakter, int pozicija){
        StringBuilder sb=new StringBuilder(sifra);

        for (int i=0; i<sifra.length(); i++){
            if (i == pozicija){
                sb.insert(i,karakter);
               // sb.append(i,karakter);
            }
        }
        return sb.toString();
    }

    public static String replace(String sifra, char karakter, int vrednost){
        //Replace * 10
        //StringBuilder sb=new StringBuilder(sifra);

            if (sifra.contains(String.valueOf(karakter))){

                        int vrednostKaraktera = karakter;

                        int zbir = vrednostKaraktera + vrednost;

                        char noviKarakter = (char) zbir;

                        sifra = sifra.replace(karakter, noviKarakter);
                    }


        return sifra;

    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String sifra=scanner.nextLine();

        while (true){
              String komanda=scanner.nextLine();

            if (komanda.equals("Complete")){
                break;
            }

            String[] deloviunosa=komanda.split(" ");
           // String komanda=deloviunosa[0];

            //if (komanda.equals("Make Upper")){ //Make Upper {index}"
            if (komanda.contains("Make Upper")){
            int pozicija=Integer.parseInt(deloviunosa[2]);
            sifra= velikoSlovo(sifra, pozicija);
                System.out.printf("%s\n", sifra);



            } else if (komanda.contains("Make Lower")){ //⦁	"Make Lower {index}"
                 int pozicija=Integer.parseInt(deloviunosa[2]);
                 //maloSlovo(sifra,pozicija);
                sifra= maloSlovo(sifra, pozicija);
                System.out.printf("%s\n", sifra);



            } else if (komanda.contains("Insert")){ //⦁	"Insert {index} {char}"
                int pozicija=Integer.parseInt(deloviunosa[1]);
                String karakter= deloviunosa[2];
                sifra=insert(sifra, karakter, pozicija);
                System.out.printf("%s\n", sifra);

                
            } else if (komanda.contains("Replace")){ //Replace {char} {value}"
                char karakter= deloviunosa[1].charAt(0);
                int vrednost=Integer.parseInt(deloviunosa[2]);
                sifra=replace(sifra, karakter, vrednost);
                System.out.printf("%s\n",sifra);


            } else if (komanda.contains("Validation")) {
                validacija(sifra);
            }
        }

    }

}
