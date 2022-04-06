import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++){
            stack.push(sc.nextInt());
        }

        int last = stack.pop();
        int count = 1;
        while (!stack.isEmpty()){
            int target = stack.pop();
            if (target > last){
                count++;
                last = target;
            }
        }
        System.out.println(count);
    }
}