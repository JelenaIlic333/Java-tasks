import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Objects_and_Classes_04 {

    public static class Song {
        private String typeList;
        private String ime;
        private String vreme;

    public Song(String typeList, String ime, String vreme){
        this.typeList=typeList;
        this.ime=ime;
        this.vreme=vreme;
    }
    public Song(){

    }
        public String getTypeList(){
            return typeList;
        }

        public void setTypeList (String typeList){
            this.typeList = typeList;

        }

        public String getIme(){
        return ime;
        }

        public void setIme(String novoIme){
        this.ime= novoIme;
        }

        public String getVreme(){
        return vreme;
        }

        public void setVreme(String novoVreme){
        this.vreme=novoVreme;
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int brojPesme=Integer.parseInt(scanner.nextLine());

        ArrayList<Song> pesme=new ArrayList<>();

        for (int i=0; i<brojPesme; i++){
            String [] data=scanner.nextLine().split("_");
            String type=data[0];
            String name=data[1];
            String time=data[2];

            Song song=new Song(type,name,time);
            song.setTypeList(type);
            song.setIme(name);
            song.setVreme(time);

            pesme.add(song);
        }
        String tip_pesme_koje_stampamo=scanner.nextLine();
        if (tip_pesme_koje_stampamo.equals("all")){
            for (Song s : pesme){
                System.out.println(s.getIme());
            }
        }else {
            for (Song s : pesme){
                if (s.getTypeList().equals(tip_pesme_koje_stampamo)){
                    System.out.println(s.getIme());
                }
            }
        }




    }
}
