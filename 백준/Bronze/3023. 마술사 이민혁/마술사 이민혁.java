import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        char[][] arr = new char[r*2][c*2];

        for (int i = 0; i < r; i++) {
            String str = sc.next();
            for (int j = 0; j < c; j++){
                char chr = str.charAt(j);
                arr[i][j] = chr;
                arr[i][c*2-1-j] =  chr;
                arr[r*2-1-i][j] =chr;
                arr[r*2-1-i][c*2-1-j] =chr;
            }
        }
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        if (arr[a][b] == '.'){
            arr[a][b] = '#';
        }else{
            arr[a][b] = '.';
        }

        for(int i = 0; i < r*2; i++){
            System.out.print(arr[i]);
            System.out.println();
        }
    }
}
