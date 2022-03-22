import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());
        br.close();
        int fly = 1;
        int cnt = 0;
        int bird = N;
        while (bird >= 1) {
            // 날아가는 새가 현재 남은 새보다 많은 경우
            if (bird < fly) {
                fly = 1;
            }
            bird = bird - fly;
            fly++;
            cnt++;
        }
        System.out.println(cnt);
    }
}