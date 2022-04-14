import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hansu = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < hansu.length(); i++) {
            arr[hansu.charAt(i) - 'A']++;
        }
        // 문자열 길이 짝수, 홀수
        boolean length = hansu.length() % 2 == 0;

        int count = 0;
        int center = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                center = i;
                count++;
            }

        }

        // 문자열의 길이가 짝수이면
        // 모든 알파밧의 숫자도 짝수여야한다
        // 문자열의 길이가 홀수이면

        StringBuilder sb = new StringBuilder();
        if ((!length && count > 1 || length && count >= 1)) {
            System.out.println("I'm Sorry Hansoo");
        } else {
            for (int j = 0; j < arr.length; j++) {
                for (int i = 0; i < arr[j]/2; i++) {
                    sb.append((char) (j + 'A'));
                }
            }
            StringBuilder reverse = new StringBuilder(sb).reverse();
            if (!length) {
                sb.append((char)(center+'A')).append(reverse);
            } else {
                sb.append(reverse);
            }
        }
        System.out.println(sb);


    }

}
