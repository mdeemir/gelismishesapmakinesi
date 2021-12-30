package Giris;

import java.util.Scanner;

public class YildizlarlaTersUcgen {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;

        System.out.print("Ters üçgen için basamak sayısı: ");
        n= input.nextInt();

        for (int i=1; i<=n; i++) {

            for (int k=1; k<=(2*i-k);k++){
                System.out.print(" ");
            }

            for (int j=1; j<=2*(n-i)+1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
