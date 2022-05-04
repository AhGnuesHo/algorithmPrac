import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] iArr = new int[n];
        for (int i = 0; i < n; i ++){
            iArr[i] = sc.nextInt();
        }
        
        Arrays.sort(iArr);
        
        int timeResult = 0;
        for (int i = 0; i < n; i++) {
            for(int k=0; k<i+1; k++) {
                timeResult += iArr[k];
            }
        }
        System.out.println(timeResult);
    }

}





