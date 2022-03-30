import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스
        int[][] arr = new int[15][15];

        // 각 층에 살고있는 사람들의 수
        for (int i = 0; i < 15; i ++){
             arr[i][1] = 1; // 각층의 1호에는 한명만 산다
             arr[0][i] = i; // 0층에는 호수만큼 산다
        }

        for (int i = 0; i < t; i++){
            int row = sc.nextInt();
            int column = sc.nextInt();
            System.out.println (count(row,column));
        }
    }
    public static int count(int r, int c){
        if (r == 0){
            return c;
        }
        if (c == 1){
            return 1;
        }
        return count(r,c-1)+ count(r-1, c);
    }
}
