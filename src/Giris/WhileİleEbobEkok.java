package Giris;


import java.util.Scanner;

public class WhileİleEbobEkok {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1,n2;
        System.out.print("İlk sayıyı giriniz: ");
        n1= input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2= input.nextInt();

        if (n1<=n2){
           int i=n1;
            while (i>=1) {
               if(n1%i==0 && n2%i==0) {
                   System.out.println("EBOB : "+ i);
                   break;
               }
               i--;
            }

        }else {
            int k=n2;
            while (k>=1) {
                if(n1%k==0 && n2%k==0) {
                    System.out.println("EBOB : "+ k );
                    break;
                }
                k--;
            }
        }


        int j=1;
        while (j<=(n1*n2)){
            if (j%n1==0 && j%n2==0){
                System.out.println("EKOK : "+ j);
                break;
            }
            j++;
        }
    }
}
