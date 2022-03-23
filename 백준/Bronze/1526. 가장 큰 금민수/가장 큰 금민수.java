import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int max = 0;
        for (int i = n; i >= 4; i--) {
            boolean isRight = true;
            int num = i;
            while (num != 0){
                if (num % 10 == 4 || num % 10 == 7) {
                    num /= 10;
                } else {
                    isRight = false;
                    break;
                }
            }
            if (isRight){
                 max = i;
                 break;
            }
        }
        System.out.println(max);
    }
}