import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] packArr = new int[m];
        int[] bundleArr = new int[m];

        for (int i = 0; i < m; i++){
            packArr[i] =  sc.nextInt();
            bundleArr[i] = sc.nextInt();
        }

        Arrays.sort(packArr);
        Arrays.sort(bundleArr);

        int result = 0;

        int min  = Math.min(((n/6)+1)*packArr[0], n*bundleArr[0]);
        result = Math.min(min, ((n/6))*packArr[0] + (n%6)*bundleArr[0]);
        

        System.out.println(result);
    }
}
