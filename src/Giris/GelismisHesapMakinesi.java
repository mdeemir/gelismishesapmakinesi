package Giris;

import java.util.Scanner;

public class GelismisHesapMakinesi {

    static int sum (int a, int b){
        int result= a+b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static int minus (int a, int b){
        int result=a-b;
        System.out.println("Çıkarma: " + result);
        return result;
    }

    static int times (int a, int b){
        int result=a*b;
        System.out.println("Çarpma:  "+ result);
        return result;
    }

    static int divided (int a,int b) {
        if (b==0){
            return 0;
        }
        int result=a/b;
        return result;
    }

    static void power (int a, int b){
        int result=1;
        for (int i=1; i<=b; i++) {
            result*=a;
        }
        System.out.println("Üs alma sonucu: "+result);
    }

    static void mod (int a, int b){
        int result=a%b;
        System.out.println("Mod sonucu :" +result);
    }

    static void calc (int a, int b){
        System.out.println("Dikdörtgenin alanı: " + (a*b));
        System.out.println("Dikdörtgenin çevresi: "+ (2*(a+b)));
    }





    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int select;
        int a, b;

        String menu=
                "1-Toplama İşlemi\n" +
                "2-Çıkarma İşlemi\n" +
                "3-Çarpma İşlemi\n"+
                "4-Bölme işlem\n"+
                "5-Üs alma işlemi\n" +
                "6-Mod alma işlemi\n"+
                "7-Dikdötgen alan ve çevre hesabı\n"+
                "8-Çıkış yap";

        System.out.println(menu);

        while (true){
            System.out.print("Yapmak istediğiniz işlemi giriniz: ");
            select=input.nextInt();

            if (select==8){
                System.out.println("Tekrar görüşmek üzere");
                break;
            } else if (select>8 || select<=0){
                System.out.println("Yanlış bir seçim yaptınız");
                break;

            }

            System.out.print("İlk sayıyı giriniz: ");
            a= input.nextInt();
            System.out.print("İkinci sayıyı giriniz: ");
            b=input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    if (divided(a,b)==0){
                        System.out.println("İkinci sayı sıfırdan farklı bir sayı olmalıdır.");
                    } else System.out.println("Bölme.: " +divided(a,b));
                    break;
                case 5:
                    power(a,b);
                    break;
                case 6:
                    mod(a,b);
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:

            }


        }






    }
}
