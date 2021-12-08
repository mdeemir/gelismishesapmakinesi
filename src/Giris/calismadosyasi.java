package Giris;

import java.util.Scanner;

public class calismadosyasi {
    public static void main(String[] args) {
       int total=1, k=1;
       int n;


       Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyel Sayısını giriniz: ");
        n= input.nextInt();

        while (k<=n) {
            total=total*k;
            k++;



        }


        System.out.println(n + " sayısının faktöriyeli: " + total);

    }
}
