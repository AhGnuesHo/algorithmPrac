import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                count++;
            } else if (i == 1000) {
                continue;
            } else {
                int[] arr = new int[3];
                int target = i;
                for (int j = 0; j < 3; j++) {
                    arr[j] = target % 10;
                    target /= 10;
                }
                if (arr[1]-arr[0] == arr[2]-arr[1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}
