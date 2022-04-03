import javax.naming.PartialResultException;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            String target = sc.next();
            Stack<Character> stack = new Stack<>();

            boolean flg = true;
            for (int j = 0; j < target.length(); j++) {
                char c = target.charAt(j);
                if (c == 40){ // (
                    stack.push(c);
                } else { // )
                   if (stack.empty() || stack.pop() != 40){
                       flg = false;
                   }
                }
            }
            if (!stack.empty()){
                flg = false;
            }
            if (flg){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}