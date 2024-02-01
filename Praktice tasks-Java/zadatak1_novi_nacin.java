import java.util.Scanner;

public class zadatak1_novi_nacin {
    public static String promeniSlova(String email, String slova) {
        String novi="";
        if (slova.equals("Upper")) {
            for (int i = 0; i < email.length(); i++) {
                String zamena= String.valueOf(i + 1);
                String velikoSlovo= String.valueOf(Character.toLowerCase(email.charAt(i)));
                novi= velikoSlovo;



            }
//        } else if (slova.equals("Lower")) {
//            String novi1="";
//            for (int i = 0; i < email.length(); i++) {
//
//                novi.replace(i, i + 1, String.valueOf(Character.toLowerCase(email.charAt(i))));
//
//            }
//
       }
        return novi;

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
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < email.length(); i++) {
            char trenutniKarakter = email.charAt(i);

            if (trenutniKarakter == '@') {
                int pozicijaKaraktera = i;

                for (int j = 0; j < pozicijaKaraktera; j++) {
                    sb.append(email.charAt(j));
                }
            } else {
                System.out.printf("The email %s doesn't contain the @ symbol.", email);
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

    public static void encrypt(String email){
        for (int i=0; i<email.length(); i++){
            int vrednost=email.charAt(i);
            System.out.printf("%d ",vrednost);
        }
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
                System.out.println(email);
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
                encrypt(email);

            }


        }


    }
}
