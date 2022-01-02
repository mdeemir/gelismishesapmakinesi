package Giris;

import java.util.Scanner;

public class FibonacciSerisiBulan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("FİBONACCİ SERİSİ\nSerinin eleman sayısını giriniz: ");
        int n= input.nextInt();

        int result=0;
        int a=0;
        int b=1;

        System.out.print(a+ "  ");
        System.out.print(b+ "  ");

        for (int i=2; i<=n;i++) {
            result=a+b;
            System.out.print(result);
            System.out.print("  ");
            a=b;
            b=result;
        }
    }
}
