import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean[] arr = new boolean[26]; // 알파벳이 떨어져서 나오는지 확인

        for (int i = 0; i < n; i ++){
            Arrays.fill(arr,false); // 배열 초기화

            char[] str = sc.next().toCharArray(); // 문자열 변환
            boolean flg = true;
            for(int j = 1; j < str.length; j++){ // 문자열 길이만큼
                if (str[j] != str[j-1]){ // 현재 알파벳과 붙어있는 알파벳이 다르면 현재 알파벳은 true로 변환
                    // 현재 알파벳이 이미 true이면 떨어져 있는 알파벳이므로 그룹단어 아님.
                    if (arr[str[j-1] - 97] || arr[str[j] - 97]){
                        flg = false;
                        break;
                    } else {
                        arr[str[j-1] - 97] = true;
                    }
                }
            }
            if (flg){
                count++;
            }
        }
        System.out.println(count);
    }
}