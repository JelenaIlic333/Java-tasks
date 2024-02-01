import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Objects_and_Classes_Exercise_04 {
    static class Student{
        private String firstName;
        private String lastName;
        private double grade;

        private Student(String firstName, String lastName, double grade){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;
        }
        public Student (String redTeksta){
            String [] delovi=redTeksta.split(" ");
            this.firstName=delovi[0];
            this.lastName=delovi[1];
            this.grade=Double.parseDouble(delovi[2]);
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
        }

        public double getGrade(){
            return this.grade;
        }

        public String getLastName(){
            return this.lastName;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=Integer.parseInt(scanner.nextLine());

        ArrayList<Student> studenti=new ArrayList<>();

        for (int i=1; i<=n; i++){
            String unos=scanner.nextLine();

            Student trenutniStudent=new Student(unos);
            studenti.add(trenutniStudent);
        }

        studenti.sort(Comparator.comparingDouble(Student :: getGrade).reversed());
//        studenti.sort(Comparator.comparing(Student::getLastName).reversed());

        for (Student s : studenti){
            System.out.println(s);
        }
    }
}
