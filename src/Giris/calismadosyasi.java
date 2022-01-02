package Giris;
import java.util.Scanner;

public class calismadosyasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int N = input.nextInt();
      int result;
      for (int i=1; i<=10; i++){
          result= N*i;
          System.out.println(N+ " " + "*"+ " "+ i+ " = "+ result );
      }
    }
}