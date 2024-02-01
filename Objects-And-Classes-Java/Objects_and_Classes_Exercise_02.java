import java.util.Scanner;

public class Objects_and_Classes_Exercise_02 {
    public static class Artical {
        private String title;
        private String content;
        private String author;

        public Artical(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public Artical(String redZaObjekat) {
            String[] delovi = redZaObjekat.split(", ");
            this.title = delovi[0];
            this.content = delovi[1];
            this.author = delovi[2];
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s", this.title, this.content, this.author);
        }

        public void edit(String newContent) {
            this.content = newContent;
        }

        public void changeAuthor(String newAuthor) {
            this.author = newAuthor;
        }

        public void rename(String newName) {
            this.title = newName;
        }
    }
        public static void main(String[] args) {

            Scanner scanner=new Scanner(System.in);

            String radZaObjekat=scanner.nextLine();

            Artical trenutni=new Artical(radZaObjekat);

            int n=Integer.parseInt(scanner.nextLine());

            for (int i=1; i<=n; i++){
                String komanda=scanner.nextLine();
                String [] deloviKomande=komanda.split(": ");
                komanda=deloviKomande[0];
                String novaVrednost=deloviKomande[1];

                if (komanda.equals("Edit")){
                    trenutni.edit(novaVrednost);
                } else if (komanda.equals("ChangeAuthor")){
                    trenutni.changeAuthor(novaVrednost);
                } else if (komanda.equals("Rename")){
                    trenutni.rename(novaVrednost);
                }
            }
            System.out.println(trenutni);
        }
}
