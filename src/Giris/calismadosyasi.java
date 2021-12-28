package Giris;



public class calismadosyasi {
    public static void main(String[] args) {

       int basdeg, baspow=1;

       int result=0;



       for (int number=100;number<1000;number++){

            while (number!=0){

                basdeg=number%10;

                baspow=basdeg*basdeg*basdeg;

                result+=baspow;

                number=number%10;

                if (result==number){
                    System.out.println(number);

                }
                }


        }

}





}



