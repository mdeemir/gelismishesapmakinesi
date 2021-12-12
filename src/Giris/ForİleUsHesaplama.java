package Giris;
import java.util.Scanner;
public class ForİleUsHesaplama {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n, k;

        System.out.print("Üssü alınacak sayıyı giriniz: ");
        n=input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        k=input.nextInt();

        int toplam = 1;

        for (int i= 1; i<=k; i++) {
            toplam *=n;
        }

        System.out.println("Cevap= " + toplam);
    }
}
