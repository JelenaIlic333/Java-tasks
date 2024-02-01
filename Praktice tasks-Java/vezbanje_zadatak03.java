import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class vezbanje_zadatak03 {

    public static void ispisiPodatkeHeroja(LinkedHashMap<String, ArrayList<Integer>> heroji){
        for (Map.Entry<String, ArrayList<Integer>> kljuc_vrednost : heroji.entrySet()){
            String heroName=kljuc_vrednost.getKey();
            int hp=kljuc_vrednost.getValue().get(0);
            int mp=kljuc_vrednost.getValue().get(1);
            System.out.println(heroName);
            System.out.printf("HP: %d\n", hp);
            System.out.printf("MP: %d\n", mp);
        }
    }

    public static void castSpell(LinkedHashMap<String, ArrayList<Integer>> heroji, String heroName, int mpNedded, String spellName){
        ArrayList<Integer> stats=heroji.get(heroName);
        int mp=stats.get(1);

        if (mp >= mpNedded){
            mp=mp - mpNedded;
            heroji.get(heroName).set(1,mp);

            System.out.printf("%s has successfully cast %s and now has %d MP!\n", heroName,spellName,mp);
        }else {
            System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
        }
    }

    public static void takeDamage(LinkedHashMap<String, ArrayList<Integer>> heroji, String heroName, int damage, String napadac){
        ArrayList<Integer> stats=heroji.get(heroName);
        int hp=stats.get(0);

        if (damage >=hp){
            System.out.printf("%s has been killed by %s!\n", heroName, napadac);
            heroji.remove(heroName);
        }else {
            hp= hp - damage;
            heroji.get(heroName).set(0, hp);
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, napadac, hp);
        }
    }

    public static void recharge(LinkedHashMap<String, ArrayList<Integer>> heroji, String heroName, int iznosDopune){
        int trenutnaMana=heroji.get(heroName).get(1);
        int finalnaMana=trenutnaMana + iznosDopune;

        if (finalnaMana > 200){
            iznosDopune= 200 - trenutnaMana;
            finalnaMana=200;
        }
        heroji.get(heroName).set(1, finalnaMana);
        System.out.printf("%s recharged for %d MP!\n", heroName, iznosDopune);
    }

    public static void heal(LinkedHashMap<String, ArrayList<Integer>> heroji, String heroName, int iznosDopuneHP){
        int trenutniHP=heroji.get(heroName).get(0);
        int finalniHP= trenutniHP + iznosDopuneHP;

        if (finalniHP > 100){
            iznosDopuneHP = 100 - trenutniHP;
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
            String unos=scanner.nextLine();
            String[] delovi=unos.split(" ");
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
            String [] delovi=unos.split(" - ");
            String komanda=delovi[0];

            if (komanda.equals("CastSpell")){
                String heroName=delovi[1];
                int mpNeeded=Integer.parseInt(delovi[2]);
                String spellName=delovi[3];
                castSpell(heroji, heroName, mpNeeded, spellName);

            } else if (komanda.equals("TakeDamage")){
                String heroName=delovi[1];
                int damage=Integer.parseInt(delovi[2]);
                String napadac=delovi[3];
                takeDamage(heroji, heroName, damage, napadac);

            } else if (komanda.equals("Recharge")){
                String heroName=delovi[1];
                int iznosZaRecharge=Integer.parseInt(delovi[2]);
                recharge(heroji, heroName, iznosZaRecharge);

            }else if (komanda.equals("Heal")){
                String heroName=delovi[1];
                int iznosZaHeal=Integer.parseInt(delovi[2]);
                heal(heroji, heroName, iznosZaHeal);
            }

        }
        ispisiPodatkeHeroja(heroji);
    }
}
