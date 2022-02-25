import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 운동 시간
        int m = Integer.parseInt(st.nextToken()); // 초기 맥박, 최소 맥박
        int M = Integer.parseInt(st.nextToken()); // 최대 맥박
        int T = Integer.parseInt(st.nextToken()); // 운동할 때 증가
        int R = Integer.parseInt(st.nextToken()); // 휴식 감소 맥박

        int X = m; // 현재 맥박

        int min = 0;

        // 운동을 한번도 못하는 경우
        if (m + T > M){
            System.out.println(-1);
            return;
        }
        
        while (N > 0){
            int exX = X + T;

            // exX가 M보다 작거나 같아야만 운동
            if (exX <= M){
                X += T;
                N--;
            }
            //  exX가 M보다 작으면 휴식
            else {
                X -= R;
                if (X < m){
                    X = m;
                }
            }
            min++;
        }

        System.out.println(min);
    }
}

