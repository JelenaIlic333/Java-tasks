import java.util.Scanner;
public class PripremaZaIspit_01_IIdeo {

    public static String insertSpace(String tekst, int pozicija){
        StringBuilder sb=new StringBuilder();

        for (int i=0; i<tekst.length(); i++){
            if (i == pozicija){
                sb.append(" ");
            }
            sb.append(tekst.charAt(i));
        }
        return sb.toString();
    }

    public static String okreniUnazad(String tekst){
        int n=tekst.length();
        StringBuilder sb=new StringBuilder();

        for (int i=n-1; i>=0; i--){
            sb.append(tekst.charAt(i));
        }
        return sb.toString();
    }

    public static String reverse(String tekst, String podstringZaZamenu){
        int pozicijaPodstringa=tekst.indexOf(podstringZaZamenu);
        int duzina=podstringZaZamenu.length();
        String svePrePodstringa=tekst.substring(0, pozicijaPodstringa);
        String svePoslePodstrinda=tekst.substring(pozicijaPodstringa + duzina);
        String rez=svePrePodstringa + svePoslePodstrinda;
        tekst=rez + okreniUnazad(podstringZaZamenu);
        return tekst;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sifrovaniTekst=scanner.nextLine();

        while (true){
            String unos=scanner.nextLine();
            if (unos.equals("Reveal")) break;

            String[] delovi=unos.split(":\\|:");
            String komanda=delovi[0];

            switch (komanda){
                case "InsertSpace":
                    int pozicija=Integer.parseInt(delovi[1]);
                    sifrovaniTekst=insertSpace(sifrovaniTekst, pozicija);
                    break;
                case "Reverse":
                    String podstring=delovi[1];
                    if (!sifrovaniTekst.contains(podstring)){
                        System.out.println("error");
                        continue;
                    }
                    sifrovaniTekst= reverse(sifrovaniTekst, podstring);
                    break;
                case "ChangeAll":
                    String podstrindZaZamenu=delovi[1];
                    String zamena=delovi[2];
                    sifrovaniTekst=sifrovaniTekst.replaceAll(podstrindZaZamenu, zamena);
                    break;
            }
            System.out.println(sifrovaniTekst);
        }
        System.out.printf("You have a new text message: %s", sifrovaniTekst);
    }
}
