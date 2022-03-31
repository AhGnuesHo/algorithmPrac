import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] n = br.readLine().split(" ");
       int count = 0;
       for (int i = 0; i<n.length; i++){
           if (!n[i].equals("")){
               count++;
           }
       }
       System.out.println(count);
    }
}