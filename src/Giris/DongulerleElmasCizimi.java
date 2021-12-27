package Giris;

import java.util.Scanner;

public class DongulerleElmasCizimi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Elmas boyutunu belirlemek için sayı giriniz: ");
        int n=input.nextInt();

        for (int i=1;i<=n;i++){
            for (int k=1; k<=(n-i);k++){
                System.out.print(" ");
            }
            for (int m=1; m<=(2*i)-1;m++){
                System.out.print("*");
            }

            System.out.println();

        }
        for (int j=1;j<=(n-1);j++){
            for (int k=1; k<=j;k++){
                System.out.print(" ");
            }
            for (int p=1;p<=2*(n-j)-1;p++){
                System.out.print("*");
            }

            System.out.println();

        }


    }
}
