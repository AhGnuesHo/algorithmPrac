import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < n; i++){
            stack.clear();
            String str = sc.next();

            for (int j = 0; j < str.length(); j ++){
                char c = str.charAt(j);
                if (!stack.isEmpty()){
                    if (stack.peek() == c){
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()){
                count++;
            }
        }

        System.out.println(count);

    }
}