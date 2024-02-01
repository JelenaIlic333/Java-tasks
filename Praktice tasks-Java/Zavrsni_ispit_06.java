import java.util.Scanner;

public class Zavrsni_ispit_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int pocetak_opsega=Integer.parseInt(scanner.nextLine());
        int kraj_opsega=Integer.parseInt(scanner.nextLine());

        String prvi_opseg_u_tekst="" + pocetak_opsega;
        int hiljade_prvi_opseg=Integer.parseInt(prvi_opseg_u_tekst.charAt(0) + "");
        int stotine_prvi_opseg=Integer.parseInt(prvi_opseg_u_tekst.charAt(1) + "");
        int desetice_prvi_opseg=Integer.parseInt(prvi_opseg_u_tekst.charAt(2) + "");
        int jedinice_prvi_opseg=Integer.parseInt(prvi_opseg_u_tekst.charAt(3) + "");

        String kraj_opsega_u_tekst="" + kraj_opsega;
        int hiljade_kraj_opsega=Integer.parseInt(kraj_opsega_u_tekst.charAt(0) + "");
        int stotine_kraj_opsega=Integer.parseInt(kraj_opsega_u_tekst.charAt(1) + "");
        int desetice_kraj_opsega=Integer.parseInt(kraj_opsega_u_tekst.charAt(2) + "");
        int jedinice_kraj_opsega=Integer.parseInt(kraj_opsega_u_tekst.charAt(3) + "");

        for (int hiljade=hiljade_prvi_opseg; hiljade<=hiljade_kraj_opsega; hiljade++){
        for (int stotine=stotine_prvi_opseg; stotine<=stotine_kraj_opsega; stotine++){
        for (int desetice=desetice_prvi_opseg; desetice<=desetice_kraj_opsega; desetice++){
        for (int jedinice=jedinice_prvi_opseg; jedinice<=jedinice_kraj_opsega; jedinice++){
            if (hiljade % 2 !=0 && stotine % 2 !=0 && desetice % 2 !=0 && jedinice % 2  !=0){
                System.out.printf("%d%d%d%d ", hiljade, stotine, desetice, jedinice);
            }

        }}}}






    }
}
