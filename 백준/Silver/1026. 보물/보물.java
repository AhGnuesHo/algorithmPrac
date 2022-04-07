import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[2][n];

        for (int h = 0; h < 2; h++) {
            for (int i = 0; i < n; i++) {
                arr[h][i] = Integer.parseInt(sc.next());
            }
        }

        int[] aArr = arr[0];
        Arrays.sort(aArr);
        int[] bArr = arr[1];
        Arrays.sort(bArr);

        int result = 0;

        for (int i = 0; i < n; i++) {
            result += aArr[i] * bArr[n-1-i];
        }

        System.out.println(result);
    }
}