import java.util.Scanner;

public class zadatak1 {

    public static String promeniSlova(String email, String slova) {
        StringBuilder sb = new StringBuilder(email);
        if (slova.equals("Upper")) {
            for (int i = 0; i < email.length(); i++) {

                sb.replace(i, i + 1, String.valueOf(Character.toUpperCase(email.charAt(i))));

            }
        } else if (slova.equals("Lower")) {
            sb = new StringBuilder(email);
            for (int i = 0; i < email.length(); i++) {

                sb.replace(i, i + 1, String.valueOf(Character.toLowerCase(email.charAt(i))));

            }

        }
        return sb.toString();

    }


    public static String getDomain(String email, int brojKaraktera) {
        StringBuilder sb = new StringBuilder();
        int pozicijaOdKojeKrecem = email.length() - brojKaraktera;

        for (int i = pozicijaOdKojeKrecem; i < email.length(); i++) {
            sb.append(email.charAt(i));
        }
        return sb.toString();
    }

    public static String getUsername(String email) {
        StringBuilder sb = new StringBuilder(email);

        for (int i = 0; i < email.length(); i++) {
            char trenutniKarakter = email.charAt(i);

            if (trenutniKarakter == '@') {
                int pozicijaKaraktera = i;

                for (int j = 0; j < pozicijaKaraktera; j++) {
                    sb.append(email.charAt(j));
                }
            } else {
                System.out.printf("The email %s doesn't contain the @ symbol.", email);
                break;
            }
        }
        return sb.toString();
    }

    public static String replace(String email, char karakter) {

        for (int i = 0; i < email.length(); i++) {
            email = email.replaceAll("-", String.valueOf(karakter));

        }
        return email;
    }

    public static String encrypt(String email){
        for (int i=0; i<email.length(); i++){
            int vrednost=email.charAt(i);
            System.out.printf("%d ",vrednost);
        }
        return email;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
         String email=scanner.nextLine();


        while (true){
            String unos=scanner.nextLine();

            if (unos.equals("Complete")){
                break;
            }
            String[] deloviUnosa=unos.split(" ");
            String komanda=deloviUnosa[0];

            if (komanda.equals("Make")){
                String slova=deloviUnosa[1];
             email=promeniSlova(email, slova);
            } else if (komanda.equals("GetDomain")) { //⦁	"GetDomain {count}"
                int brojKaraktera=Integer.parseInt(deloviUnosa[1]);
                email=getDomain(email, brojKaraktera);
                System.out.println(email);
            } else if (komanda.equals("GetUsername")) {
              email=getUsername(email);
                System.out.println(email);
                
            } else if (komanda.equals("Replace")) { //⦁	"Replace {char}"
                char karakter=deloviUnosa[1].charAt(0);
                email=replace(email, karakter);
                System.out.println(email);
            } else if (komanda.equals("Encrypt")){
                email=encrypt(email);

            }


        }


    }
}
//Mike123@somemail.com
//Make Upper
//GetDomain 3
//GetUsername
//Encrypt
//Complete
