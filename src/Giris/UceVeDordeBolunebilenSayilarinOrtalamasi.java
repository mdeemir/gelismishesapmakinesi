package Giris;

import java.util.Scanner;

public class UceVeDordeBolunebilenSayilarinOrtalamasi {
    public static void main(String[] args) {
        int k,count=0, n, total, average;

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen sayı giriniz: ");
        k= input.nextInt();
        System.out.println("0'dan " + k + " sayısına kadar olan sayıların:");

        for (int i=0; i<=k; i++ ) {
            if (i%3==0 && i%4==0) {
                count++;
            }
        }

        n=(count-1); // n = bölünebilen sayı adedi
        total = 12 * (n*(n+1)/2);
        average=total/n;

        System.out.println("ADEDİ: " + n);
        System.out.println("TOPLAMI: " + total);
        System.out.println("ORTALAMASI: "+ average);

    }
}

