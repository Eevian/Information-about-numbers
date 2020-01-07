
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut");       
        int summa = 0;
        int lukumaara = 0;
        int parillisia = 0;
        int parittomia = 0;
        
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }
            if (luku % 2 == 0) {
                parillisia++;
            } else {  
                parittomia++; 
            }    
            summa = summa + luku;
            lukumaara++;

        }
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: " + summa);
        System.out.println("Lukuja: " + lukumaara);
        double keskiarvo = (double) summa/lukumaara;
        System.out.println("Keskiarvo: " + keskiarvo);
        System.out.println("Parillisia: " + parillisia);
        System.out.println("Parittomia: " + parittomia);
    }
}