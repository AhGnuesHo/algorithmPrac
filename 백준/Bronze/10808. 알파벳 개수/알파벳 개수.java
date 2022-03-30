import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       char[] str = br.readLine().toCharArray();
       int[] arr = new int[27];
       Arrays.fill(arr, 0);

       for (int i = 0; i < str.length; i ++){
           arr[str[i]-96]++;
       }

       for (int i = 1; i<arr.length; i ++){
           System.out.print(arr[i]+ " ");
       }
    }
}

