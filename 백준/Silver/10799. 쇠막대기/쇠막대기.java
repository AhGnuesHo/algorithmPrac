import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] string = sc.next().split("");

        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < string.length; i++){
            if (string[i].equals("(")){ // 막대기 시작
                stack.push(i);
            }else { // )
                if (stack.pop() == i-1){// 레이저인 경우
                    result += stack.size();
                } else { // 막대기 끝
                    result += 1;
                }
            }
        }
        System.out.println(result);
    }
}