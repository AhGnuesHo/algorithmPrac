import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 노래 갯수
        int L = sc.nextInt(); // 노래 길이
        int D = sc.nextInt(); // 전화가 울리는 때

        int cooltime = 5;

        // 노래가 끝나면 대기시간이 없다.
        boolean arr[] = new boolean[(N*L)+(5*(N-1))];
        Arrays.fill(arr, false);

        for (int i = 0 ; i < N; i++){

            int index1 = i * (5 + L) ;
            int index2 = index1 + L;

            for (int j = index1 ; j < index2 ; j++){
                arr[j] = true;
            }

        }

        int call = 0;
        while (call < arr.length){
            if (!arr[call]) {
                break;
            } else {
                call += D;
            }
        }
          System.out.println(call);


    }
}