package Giris;

import java.util.Scanner;

public class SwitchCaseİleAtm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String UserName, Password;
        int right = 3;
        int select;
        int balance = 1500;

        while (right > 0) {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            UserName = input.nextLine();
            System.out.print("Parolanızı Gİriniz: ");
            Password = input.nextLine();

            if (UserName.equals("patika") && Password.equals("dev123")) {
                System.out.println("Bankamıza Hoşgeldiniz. ");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı Giriniz:");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Para Miktarı Giriniz: ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Yetersiz Bakiye!!");
                            } else {
                                balance -= price2;
                                System.out.println("Kalan Bakiyeniz: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;

                    }

                } while (select != 4);
                System.out.println("Bankamızı tercih ettiğiniz için teşekkür ederiz, yine bekleriz");
                break;


            } else {

                right--;

                if (right == 0) {
                    System.out.println("Şifreniz bloke oldu lütfen bankanızla iletişim geçiniz.!");
                } else {
                    System.out.println("Yanlış Giriş Yaptınız tekrar deneyiniz!");
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}





