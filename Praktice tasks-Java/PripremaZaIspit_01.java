import java.util.Scanner;

public class PripremaZaIspit_01 {

    public static String takeOdd(String tekst){
        StringBuilder sb=new StringBuilder();

        for (int i=0; i< tekst.length(); i++){
            if (i % 2 !=0){
                char trenutniKarakter = tekst.charAt(i);
                sb.append(trenutniKarakter);
            }
        }
        return sb.toString();
    }

    public static String substitute(String tekst, String podstring, String zamena){
        while (tekst.contains(podstring)){
            tekst=tekst.replaceFirst(podstring,zamena);
        }
        return tekst;
    }

    public static String cut(String tekst, int pozicija, int duzinaPodstringa){
        if (pozicija + duzinaPodstringa >= tekst.length()){
            duzinaPodstringa=tekst.length() - pozicija;
        }
        return tekst.substring(pozicija,pozicija + duzinaPodstringa);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String inicijalnaSifra=scanner.nextLine();

        while (true){
            String komandaZaSplitovanje=scanner.nextLine();

            if (komandaZaSplitovanje.equals("Done")) {
                break;
            }
                String[] deloviKomande = komandaZaSplitovanje.split("\\s+");
                String komanda=deloviKomande[0];

                if (komanda.equals("TakeOdd")){
                    inicijalnaSifra=takeOdd(inicijalnaSifra);
                } else if (komanda.equals("Cut")){
                    int pozicija=Integer.parseInt(deloviKomande[1]);
                    int duzina=Integer.parseInt(deloviKomande[2]);
                    String podstring=cut(inicijalnaSifra,pozicija,duzina);
                    inicijalnaSifra=inicijalnaSifra.replaceFirst(podstring, "");
                } else if (komanda.equals("Substitute")){
                    String podstringKojiTrazim=deloviKomande[1];
                    String zamena=deloviKomande[2];

                    if (!inicijalnaSifra.contains(podstringKojiTrazim)){
                        System.out.println("Nothing to replace!");
                        continue;
                    }
                    inicijalnaSifra=substitute(inicijalnaSifra,podstringKojiTrazim,zamena);
                }
                System.out.println(inicijalnaSifra);
            }
            System.out.println("Your password is: " + inicijalnaSifra);
        }
    }

