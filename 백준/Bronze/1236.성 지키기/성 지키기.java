import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 세로
        int M = sc.nextInt(); // 가로
        sc.nextLine();
        
        char chars[][] = new char[N][M];

        // N 번씩 돌면서 받아오기
        for (int i = 0; i < N; i++) {
            String str = sc.nextLine();
            for (int j = 0; j < M; j++) {
                chars[i][j] = str.charAt(j);
            }
        }

        int mxCnt = 0;
        int nxCnt = 0;

        // 배열을 돌면서 X 문자가 있는지 찾아보기
        // 00, 01, 02, 0M, 10,,,1M
        for (int j = 0; j < N; j++) {
            boolean m = false;
            for (int i = 0; i < M; i++) {
                if (chars[j][i] == 'X') {
                    m = true;
                    break;
                }
            }
            if (!m) {
                mxCnt++;
            }

        }

        // 00, 10, 20, N0,
        for (int j = 0; j < M; j++) {
            boolean n = false;
            for (int i = 0; i < N; i++) {
                if (chars[i][j] == 'X') {
                    n = true;
                    break;
                }
            }
            if (!n) {
                nxCnt++;
            }
        }

        if (nxCnt > mxCnt) {
            System.out.println(nxCnt);
        } else {
            System.out.println(mxCnt);
        }

    }
}
