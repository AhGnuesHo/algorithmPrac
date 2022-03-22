import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(Rev( Rev(x)+Rev(y)));
    }

    public static int Rev(int num) {
        int[] arr = new int[4];
        int length = Integer.toString(num).length();
        for (int i = 0; i < length; i++){
            arr[i] = num%10;
            num /= 10;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < length; i++){
            result.append(arr[i]);
        }
        return Integer.parseInt(result.toString());
    }
}