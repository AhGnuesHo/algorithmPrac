import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int diff = 100;
        int result = -1;
        for (int i = 0; i < 10; i++){
            count += sc.nextInt();
            if (Math.abs(count-100) <= diff) {
                diff = Math.abs(count-100);
                result = count;
            }
        }
        System.out.println(result);
    }
}