import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.WeakHashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하기 위해서는 throws IOException을 해 주어야 함.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int q = 0; q < T; q++) {
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sj = Integer.parseInt(st.nextToken());
            int sb = Integer.parseInt(st.nextToken());

            int sjMax = 0;
            int sbMax = 0;

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i = 0; i < sj; i++) {
                int num = Integer.parseInt(st1.nextToken());

                if (num > sjMax) {
                    sjMax = num;
                }

            }

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < sb; i++) {
                int num = Integer.parseInt(st2.nextToken());

                if (num > sbMax) {
                    sbMax = num;
                }

            }

            if (sbMax > sjMax){
                System.out.println("B");
            } else {
                System.out.println("S");
            }


        }



    }
}
