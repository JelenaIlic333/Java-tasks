import java.util.Random;
import java.util.Scanner;

public class Objects_and_Classes_Exercise_01 {
    public static String generisiNasumicanSlogan(){

        String[] phrases={"Excellent product.","Such a great product.","I always use that product.",
                "Best product of its category.","Exceptional product.","I can’t live without this product."};
        String[] events={"Now I feel good.","I have succeeded with this product.","Makes miracles.",
                "I am happy of the results!","I cannot believe but now I feel awesome.","Try it yourself, I am very satisfied.","I feel great!"};
        String[] authors={"Diana","Mary","Linda","Susan","Sarah","Lisa","Annie","Emily"};
        String[] cities={"London","Rome","New York","Paris","Berlin"};

        Random rand=new Random();

        int randomPozicija=rand.nextInt(phrases.length);
        String randomPhrase=phrases[randomPozicija];

        int randomPozicijaEvent=rand.nextInt(events.length);
        String randomEvent=events[randomPozicijaEvent];

        int randomPozicijaAuthor=rand.nextInt(authors.length);
        String randomAuthor=authors[randomPozicijaAuthor];

        int randomPozicijaCity=rand.nextInt(cities.length);
        String randomCity=cities[randomPozicijaCity];

        String rez=String.format("%s %s %s - %s",randomPhrase, randomEvent, randomAuthor, randomCity);
        return rez;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

        for (int i=1; i<=n; i++){
            String rezultat=generisiNasumicanSlogan();
            System.out.println(rezultat);
        }
    }
}
