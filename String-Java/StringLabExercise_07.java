import java.util.Scanner;

public class StringLabExercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // posto unosimo iz konzole

        StringBuilder sb = new StringBuilder(scanner.nextLine());

        int ukupnoNarednihKarakteraZaBrisanje = 0;


        StringBuilder resenje = new StringBuilder();

        for (int i = 0; i < sb.length(); i++){
            char trenutniKarakter = sb.charAt(i);
            ///System.out.print(trenutniKarakter +  " " );

            if (trenutniKarakter == '>'){ /// ako naletimo na > => ubacujemo karakter i povecavamo eksploziju
                /// uvecavamo snagu i posto je ovo odgovarajuci string => dodajemo ga u rezultat
                ukupnoNarednihKarakteraZaBrisanje = ukupnoNarednihKarakteraZaBrisanje + Integer.parseInt(sb.charAt(i+1) + "");
                resenje.append(trenutniKarakter);
            } else if (ukupnoNarednihKarakteraZaBrisanje > 0){ /// ako ima jos eksplozija
                ukupnoNarednihKarakteraZaBrisanje--; /// onda umanjujemo vrednost za 1
            } else {
                resenje.append(trenutniKarakter); /// ako nema vise eksplozija dodajemo u
                /// finalni tekst trenutni karakter
            }
        }

        System.out.println(resenje);

    }

}
