import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_Exercise_1 {
    public static void unesiListu(ArrayList<Integer> brojevi, String tekst){
        String [] delovi=tekst.split(" ");
        for (String  deo : delovi){
            brojevi.add(Integer.parseInt(deo));
        }
    }

    public static void ispisiListu(ArrayList<Integer> brojevi) {
        for (int broj : brojevi) {
            System.out.printf("%d ", broj);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> vagoni=new ArrayList<>();
        String tekst=scanner.nextLine();
        unesiListu(vagoni,tekst);
        int maksimalniKapacitetVagona=Integer.parseInt(scanner.nextLine());

        while (true){
            String komanda=scanner.nextLine();
            if (komanda.equals("end")){
                break;
            }
            String [] deloviKomande=komanda.split(" ");

            if (deloviKomande.length==2){
                int brojPutnika=Integer.parseInt(deloviKomande[1]);
                vagoni.add(brojPutnika);
            } else if (deloviKomande.length==1){
                int dodatakPutnika=Integer.parseInt(deloviKomande[0]);

                for (int i=0; i<vagoni.size(); i++){
                    int trenutniBrojPutnikaVagona=vagoni.get(i);
                    if (trenutniBrojPutnikaVagona + dodatakPutnika <= maksimalniKapacitetVagona){
                        int noviBrojPutnika=trenutniBrojPutnikaVagona + dodatakPutnika;
                        vagoni.set(i,noviBrojPutnika);
                        break;
                    }
                }
            }
        }
        ispisiListu(vagoni);
    }

}
