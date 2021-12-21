package Giris;
import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number= input.nextInt();

        System.out.print("Girilen sayının basamak değerleri toplamı: ");

        int basvalue;
        int result=0;

        while(number!=0){
            basvalue=number%10;
            result+=basvalue;
            number/=10;

        }
        System.out.println(result);





    }
}
