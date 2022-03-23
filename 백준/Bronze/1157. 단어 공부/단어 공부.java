import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        int length = str.length(); // 문자열의 길이
        int[] arr = new int[27];
        Arrays.fill(arr, 0);

        for(int i=0;i<length;i++){
            arr[str.charAt(i)-64]++;
        }

        int max = 0 ;
        int maxIndex = 0;
        int same = 0;
        char result = ' ';
        for (int j = 0; j < 27; j ++){
            if (arr[j] > max){
                max = arr[j];
                maxIndex = j;
                same = 0;
            }else if (max > 0 && max == arr[j]){
                same++;
            }
        }

        if (same > 0){
            result = '?';
        }else{
            result = (char)(maxIndex + 64);
        }
        System.out.println(result);
    }
}