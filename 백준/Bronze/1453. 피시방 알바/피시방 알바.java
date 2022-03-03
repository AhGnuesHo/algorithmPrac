import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();

      boolean[] booleans = new boolean[101];
      Arrays.fill(booleans,false);

      int cnt = 0;

      for (int i = 0; i < t; i++){
          int index = sc.nextInt();
          if (booleans[index]){
              cnt++;
          } else {
              booleans[index] = true;
          }
      }
      System.out.println(cnt);
    }
}
