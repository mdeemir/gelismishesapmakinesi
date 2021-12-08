package Giris;
import java.util.Scanner;
public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        int total1=1, total2=1, total3=1, combination;


        System.out.println("Kombinasyonu alınacak kümelerin değerlerini giriniz");
        System.out.print("Asıl Küme: ");
        n = input.nextInt();
        System.out.print("Alt küme: ");
        r = input.nextInt();
        System.out.print(n + " - " + r + " kombinasyonu:");

        for (int i=1;i<=n;i++){
            total1=total1*i;
        }
        for (int i=1; i<=r; i++){
            total2=total2*i;
        }
        for (int i=1; i<=(n-r);i++) {
            total3=total3*i;
        }
        combination=total1/(total2*total3);

        System.out.println(" " +combination);

    }
}
