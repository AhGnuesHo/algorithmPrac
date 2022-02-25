import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t  = sc.nextInt();

      while (t > 0){
          double money = sc.nextInt();

          int q = (int) Math.floor(money/25);

          money %= 25;

          int d  =  (int)Math.floor(money/10);

          money %= 10;

          int n  =  (int)Math.floor(money/5);

          money %= 5;

          int p  =  (int)Math.floor(money/1);

          System.out.println(q + " " + d + " " + n + " " +p+" ");
        t--;
      }

    }
}