import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] arr = new char[n][n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        int angry = Integer.parseInt(br.readLine());
        if (angry == 1) {
            one(arr);
        }
        if (angry == 2) {
            two(arr, n);
        }
        if (angry == 3) {
            three(arr, n);
        }
    }
    public static void one(char[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void two(char[][] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void three(char[][] arr, int n) {
        for (int j = n-1; j >= 0; j--) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }
}