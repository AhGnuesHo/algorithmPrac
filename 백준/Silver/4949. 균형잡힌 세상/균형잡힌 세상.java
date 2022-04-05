import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Stack<Character> stack = new Stack<>();
            String target = br.readLine();

            if (target.equals(".")) {
                break; // 종료
            }

            boolean flg = true;
            for (int i = 0; i < target.length(); i++) {
                char c = target.charAt(i);

                if (c == 40 || c == 91) { // ( or [
                    stack.push(c);
                } else if (c == 41 || c == 93) {// ) or ]
                    if (!stack.empty()) {
                        char pop = stack.pop();
                        if (!(c == 41 && pop == 40 || c == 93 && pop == 91)){
                            flg = false;
                        }
                    }else if (stack.empty()){
                        flg = false;
                    }
                }
            }
            if (!stack.empty()){
                flg = false;
            }
            if (flg) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}