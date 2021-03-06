import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 테스트케이스
        sc.nextLine();

        int[] arr = new int[N];

        // 판별 할 숫자 입력
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 소수이면 true, 아니면 false
        boolean[] isDecimal = new boolean[N];
        Arrays.fill(isDecimal, true);

        int cnt = 0;

        // 배열에 적힌 숫자
        for (int k = 0; k < arr.length; k++) {
            // 소수판별
            // 1인 경우 제외
            if (arr[k] == 1) {
                isDecimal[k] = false;
                continue;
            }
            
            for (int j = 2; j < arr[k]; j++) {
                if ( arr[k] % j == 0) {
                    isDecimal[k] = false;
                    continue;
                }
            }
        }

        for (int q = 0; q < isDecimal.length; q++){
            if (isDecimal[q] == true){
                cnt ++;
            }
        }


        System.out.println(cnt);

    }
}
