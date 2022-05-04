import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static String target;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        target = n;

        // 전체길이의 / 2 = 최대 부분 문자열의 길이부터
        int sublen = target.length() / 2;

        // 전체 길이가 홀수고, len이 짝수인 경우 탐색 한번 더 추가
        for (int i = sublen; i >= 0; i--) {
            boolean result = luckNumber(0, i);
            if (result) {
                System.out.println(i*2);
                break;
            }
            if (i == 0){
                System.out.println(0);
            }
        }
    }

    // 시작점은 바뀌고, sublen은 고정
    public static boolean luckNumber(int start, int sublen) {
        int s = start;
        if (s + 2 * sublen - 1 >= target.length()) {
            return false;
        }

        char[] pre = target.substring(s, s + sublen).toCharArray();
        char[] next = (target.substring(s + sublen, s + sublen * 2)).toCharArray();

        int sumPre = sum(pre);
        int sumNext = sum(next);

        if (sumPre == sumNext) {
          return true;
        } else {
            s += 1;
            return luckNumber(s, sublen);
        }
    }

    public static int sum(char[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++){
            result += arr[i]-48;
        }
        return result;
    }
}





