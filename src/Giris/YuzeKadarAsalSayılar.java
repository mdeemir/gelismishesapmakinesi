package Giris;

public class YuzeKadarAsalSayılar {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {
            int bolensayisi=0;
            //sayıyı kalansız bölen sayıların adedini ifade ediyor

            for (int k = 1; k <= i; k++) {
               if (i%k==0){
                   bolensayisi++;
               }
            }
            //eğer  kalansız bölen sayısı 2 ise (1 ve kendisi) bu sayı asaldır.
            // bolen sayısı>2 yazılırsa asal olmayan sayıları bulabiliriz.
            if(bolensayisi==2){
                System.out.print("  ");
                System.out.print(i);
                 }

            }
        }

}



