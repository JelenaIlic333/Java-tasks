import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_Exercise_5 {
    public static void unesiListu(ArrayList<Integer> brojevi, String tekst){
        String[] delovi=tekst.split(" ");
        for (String deo : delovi){
            brojevi.add(Integer.parseInt(deo));
        }
    }

    public static void ispisiListu(ArrayList<Integer> brojevi){
        for (int broj : brojevi){
            System.out.printf("%d ", broj);
        }
        System.out.println();
    }

    public static boolean proveriPoziciju(ArrayList<Integer> brojevi, int pozicija){
        if (pozicija>=0 && pozicija<brojevi.size()){
            return true;
        }else {
            return false;
        }
    }

    public static void detonirajListuNaPozicijiSaOpsegom(ArrayList<Integer> brojevi, int pozicija, int opseg){
        for (int i=pozicija-opseg; i<=pozicija+opseg; i++){
            int pozicijaZaBrisanje=pozicija-opseg;
            if(pozicijaZaBrisanje<0){
                pozicijaZaBrisanje=0;
            }
            if (proveriPoziciju(brojevi,pozicijaZaBrisanje)){
                brojevi.remove(pozicijaZaBrisanje);
            }
        }
    }

    public static int sumirajElementeListe(ArrayList<Integer> brojevi){
        int zbir=0;
        for (int broj : brojevi){
            zbir=zbir+broj;
        }
        return zbir;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String prvaLista=scanner.nextLine();
        String drugaLista=scanner.nextLine();

        ArrayList<Integer> brojevi=new ArrayList<>();
        ArrayList<Integer> detonacije=new ArrayList<>();

        unesiListu(brojevi,prvaLista);
        unesiListu(detonacije,drugaLista);

        int brojKojiSeDetonira=detonacije.get(0);
        int opsegDetonacije=detonacije.get(1);

        for (int i=0; i<brojevi.size(); i++){
            int trenutniElement=brojevi.get(i);
            if (trenutniElement==brojKojiSeDetonira){
                detonirajListuNaPozicijiSaOpsegom(brojevi,i,opsegDetonacije);
                i=-1;
            }
        }
        int rez=sumirajElementeListe(brojevi);
        System.out.println(rez);
    }
}
