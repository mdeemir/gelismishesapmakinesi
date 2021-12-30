package Giris;

import java.util.Scanner;

public class EnbuyukEnkücüksayıBulan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        int number;
        int max=0, min=0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        int i=1;
        while (i<=n){
            System.out.print(i+ ". Sayıyı giriniz: " );
            number= input.nextInt();
            i++;

            if (i==1){
                max=number;
                min=number;
            } else if(number>max) {
                max=number;
            } else if (number<min){
                min=number;
            }

            }
        System.out.println("En Büyük Sayı: "+ max);
        System.out.println("En Küçük Sayı: "+ min);

    }
}
