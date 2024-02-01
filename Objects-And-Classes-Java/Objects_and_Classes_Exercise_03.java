import java.util.ArrayList;
import java.util.Scanner;

public class Objects_and_Classes_Exercise_03 {
    static class Person{
        private String imeOsobe;
        private int godineOsobe;

        public Person(String imeOsobe, int godineOsobe){
            this.imeOsobe=imeOsobe;
            this.godineOsobe=godineOsobe;
        }

        public Person(String unos){
            String [] deloviUnosa=unos.split(" ");
            this.imeOsobe=deloviUnosa[0];
            this.godineOsobe=Integer.parseInt(deloviUnosa[1]);
        }

        @Override
        public String toString() {
            return String.format("%s - %d", this.imeOsobe, this.godineOsobe);
        }

        public boolean isOlderThan30(){
            return this.godineOsobe>30;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        ArrayList<Person> osobe=new ArrayList<>();

        for (int i=1; i<=n; i++){
            String unos=scanner.nextLine();
            Person trenutni=new Person(unos);
            osobe.add(trenutni);
        }

        for (Person osoba:osobe){
            if (osoba.isOlderThan30()){
                System.out.println(osoba);
            }
        }
    }
}
