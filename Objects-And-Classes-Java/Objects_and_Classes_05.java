import java.util.ArrayList;
import java.util.Scanner;

public class Objects_and_Classes_05 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;
        private String nesto;


        public Student(String fn, String ln, int age, String city) {
            this.firstName = fn;
            this.lastName = ln;
            this.age = age;
            this.city = city;

        }

        public void predstaviSe() {
            System.out.printf("%s %s is %d years old\n", this.firstName, this.lastName, this.age);
        }

        public void setAge(int noviAge) {
            this.age = noviAge;
        }

        public int getAge() {
            return this.age;
        }

        public String getCity() {
            return this.city;
        }

        public void setCity(String newName){
            this.city=newName;
        }

        public static void ispisiStudendeIzGrada(ArrayList<Student> studenti, String gradKojiTrazim){
            for (Student s:studenti){
                if (s.getCity().equals(gradKojiTrazim)){
                    s.predstaviSe();
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Student> studenti=new ArrayList<>();

        while (true) {
            String komanda = scanner.nextLine();
            if (komanda.equals("end")) break;
            String[] delovi = komanda.split(" ");
            String firstName = delovi[0];
            String lastName = delovi[1];
            int age = Integer.parseInt(delovi[2]);
            String city = "";
            for (int i = 3; i < delovi.length; i++) {
                if (i != delovi.length - 1) {
                    city += delovi[i] + " ";
                } else {
                    city += delovi[i];
                }
            }
            Student noviStudent = new Student(firstName, lastName, age, city);
            studenti.add(noviStudent);
        }
            String gradKojiTrazimo=scanner.nextLine();
            Student.ispisiStudendeIzGrada(studenti,gradKojiTrazimo);


    }
}
