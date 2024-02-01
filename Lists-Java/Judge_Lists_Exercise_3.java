import java.util.ArrayList;
import java.util.Scanner;

public class Judge_Lists_Exercise_3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int brojKomandi=Integer.parseInt(scanner.nextLine());

        ArrayList<String> imenaPozvanih=new ArrayList<>();

        for (int i=1; i<=brojKomandi; i++){
            String komanda=scanner.nextLine();
            String[] delovi=komanda.split(" ");
            String ime=delovi[0];

            if (delovi.length==3){
                if (imenaPozvanih.contains(ime)){
                    System.out.printf("%s is already in the list!\n", ime);
                }else {
                    imenaPozvanih.add(ime);
                }
            } else if (delovi.length==4){
                if (imenaPozvanih.contains(ime)){
                    imenaPozvanih.remove(ime);
                }else {
                    System.out.printf("%s is not in the list!\n", ime);
                }
            }
        }
        for (String s : imenaPozvanih){
            System.out.println(s);
        }
    }
}
