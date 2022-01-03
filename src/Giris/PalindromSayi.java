package Giris;

import java.util.Scanner;

public class PalindromSayi {

    static boolean İsPalindrom(int number) {
        int temp=number, reverseNumber=0, lastNumber;

        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber= (reverseNumber*10)+ lastNumber;
            temp/=10;

        }
        if (reverseNumber==number)
            return true;

        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("lütfen sayı giriniz: ");
        int number = input.nextInt();

        if (İsPalindrom(number)){
            System.out.println(number+ " sayısı palindron sayıdır.");
        } else {
            System.out.println(number+ " sayısı palindron sayı değildir.");
        }

    }

}
