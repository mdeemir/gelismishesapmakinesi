package Giris;
import java.util.Scanner;
public class CiftVeDortunKatlariOlanSayilariToplayan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, total=0;

        do {
            System.out.print("Sayı Gİriniz: ");
            n= scan.nextInt();
            if (n%4==0){
                total+=n;
            }

            // if (n%2==0 && n%4==0) {} şeklinde de yazılabilirdi ama zaten 4 e bölünen bir sayı çift olacağından doğrudan 4 e bölünenler toplandı
        }while (n%2==0);

        System.out.println("Girilen Sayılar İçerisinde Çift olup,\n4 e bölünebilen sayıların toplamı: " + total);


    }
}
