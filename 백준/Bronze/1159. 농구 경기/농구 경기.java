import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

      int player = Integer.parseInt(br.readLine());
      for (int i = 0; i < player; i ++){
            char playerNum = br.readLine().charAt(0);
            int index = playerNum - 97;
            arr[index]++;
      }


      boolean flg = false;

      for (int i =0; i < 26; i ++){
          if (arr[i] >= 5){
              flg = true;
              char result = (char) (i + 97);
              System.out.print(result);
          }
      }

      if (!flg){
          System.out.println("PREDAJA");
      }

    }
}
