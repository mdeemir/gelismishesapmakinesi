package Giris;
import java.util.Scanner;
public class DortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Sınır Sayısını Giriniz:");
        n = input.nextInt();;
        System.out.println(n +" sayısına kadar 4'ün kuvvetleri");
        for (int i=1; i<=n; i*=4){

            System.out.println(i);
        }
        System.out.println(n +" sayısına kadar 5'in kuvvetleri");
        for (int k=1; k<=n; k*=5){
            System.out.println(k);
        }
    }
}
