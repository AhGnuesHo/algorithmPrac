import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 악보개수
        int q = sc.nextInt(); // 질문갯수

        int[] arr = new int[n];
        int[] qarr = new int[q];
        int maxLength = 0;

        // 악보의 길이
        for(int i = 0; i < n; i ++) {
            arr[i] = sc.nextInt();
            maxLength += arr[i];
        }

        for (int i = 0; i < q; i++){
            qarr[i] = sc.nextInt();
        }


        int[] lengthArr = new int[maxLength];

        // 초
        int cnt = 0;
        for (int k = 0; k < arr.length; k++){
            int length = arr[k];
            for (int i = 0; i < length; i++){
                lengthArr[cnt] = k+1;
                cnt++;
            }

        }

        for (int i = 0; i < qarr.length; i++){
            System.out.println(lengthArr[qarr[i]]);
        }

    }
}