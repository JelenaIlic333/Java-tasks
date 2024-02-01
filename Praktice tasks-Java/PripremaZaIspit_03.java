import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PripremaZaIspit_03 {

    public static void ispisiPodatkeHeroja(LinkedHashMap<String, ArrayList<Integer>> heroji){

        for (Map.Entry<String,ArrayList<Integer>> kljuc_vredost : heroji.entrySet()){
            String heroName=kljuc_vredost.getKey();
            int HP=kljuc_vredost.getValue().get(0);
            int MP=kljuc_vredost.getValue().get(1);
            System.out.println(heroName);
            System.out.printf(" HP: %d\n", HP);
            System.out.printf(" MP: %d\n", MP);
        }
    }

    public static void castSpell(LinkedHashMap<String, ArrayList<Integer>> heroji, String heroName, int MPNeeded, String spellName){

        ArrayList<Integer> stats=heroji.get(heroName);
        int MP=stats.get(1);

        if (MP >= MPNeeded){
            MP=MP - MPNeeded;
            heroji.get(heroName).set(1, MP);

            System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName, spellName, MP);
        }else {
            System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
        }
    }

    public static void takeDamage(LinkedHashMap<String , ArrayList<Integer>> heroji, String heroName, int damage, String napadac){

        ArrayList<Integer> stats=heroji.get(heroName);
        int HP=stats.get(0);

        if (damage >= HP){
            System.out.printf("%s has been killed by %s!\n", heroName, napadac);
            heroji.remove(heroName);
        }else {
            HP=HP - damage;
            heroji.get(heroName).set(0,HP);
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left !\n", heroName, damage, napadac, HP);
        }
    }

    public static void recharge(LinkedHashMap<String, ArrayList<Integer>> heroji, String heroName, int iznosDopune){

        int trenutnaMana=heroji.get(heroName).get(1);
        int finalanaMana=trenutnaMana + iznosDopune;

        if (finalanaMana > 200){
            iznosDopune= 200 - trenutnaMana;
            finalanaMana= 200;
        }
        heroji.get(heroName).set(1, finalanaMana);

        System.out.printf("%s recharged for %d MP!\n", heroName, iznosDopune);
    }

    public static void heal(LinkedHashMap<String, ArrayList<Integer>> heroji, String heroName, int iznosDopuneHP){

        int trenutniHP=heroji.get(heroName).get(0);
        int finalniHP=trenutniHP + iznosDopuneHP;

        if (finalniHP > 100){
            iznosDopuneHP=100-trenutniHP;
            finalniHP=100;
        }

        heroji.get(heroName).set(0, finalniHP);

        System.out.printf("%s healed for %d HP!\n", heroName, iznosDopuneHP);
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<Integer>> heroji=new LinkedHashMap<>();

        for (int i=0; i<n; i++){
            String  unos=scanner.nextLine();
            String [] delovi=unos.split(" ");
            String heroName=delovi[0];
            int HP=Integer.parseInt(delovi[1]);
            int MP=Integer.parseInt(delovi[2]);

            ArrayList<Integer> stats=new ArrayList<>();
            stats.add(HP);
            stats.add(MP);
            heroji.put(heroName, stats);
        }

        while (true){
            String unos=scanner.nextLine();
            if (unos.equals("End")) break;
            String[] deloviKomande=unos.split(" - ");
            String komanda=deloviKomande[0];
            if (komanda.equals("CastSpell")){
                String heroNamne=deloviKomande[1];
                int MPNeeded=Integer.parseInt(deloviKomande[2]);
                String spellName=deloviKomande[3];
                castSpell(heroji, heroNamne, MPNeeded, spellName);
            } else if (komanda.equals("TakeDamage")){
                String heroName=deloviKomande[1];
                int damage=Integer.parseInt(deloviKomande[2]);
                String napadac=deloviKomande[3];
                takeDamage(heroji, heroName, damage, napadac);
            } else if (komanda.equals("Recharge")){
                String heroName = deloviKomande[1];
                int iznosZaRecharge = Integer.parseInt(deloviKomande[2]);

                recharge(heroji, heroName, iznosZaRecharge);


            } else if (komanda.equals("Heal")){
                String heroName=deloviKomande[1];
                int iznosZaHeal=Integer.parseInt(deloviKomande[2]);
                heal(heroji, heroName, iznosZaHeal);
            }
        }
        ispisiPodatkeHeroja(heroji);
    }
}
