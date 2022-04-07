import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int k = a%c;
        int m = b%d;


        int kWorkingDays = 0;
        if (k == 0){
            kWorkingDays+= a/c;
        } else {
            kWorkingDays = kWorkingDays + (a/c) + 1;
        }
        int mWorkingDays = 0;
        if (m == 0){
            mWorkingDays+=b/d;
        } else {
            mWorkingDays = mWorkingDays +  (b/d) + 1;
        }

        int workingDays =  Math.max(kWorkingDays, mWorkingDays);
        int result = days - workingDays;

        System.out.println(result);
    }
}