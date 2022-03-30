import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());

       String strArr[] = new String[n];

       for (int i = 0; i < n; i ++){
           strArr[i] = br.readLine();
       }

       Arrays.sort(strArr, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               if (o1.length() == o2.length()){
                   return o1.compareTo(o2);
               }else{
                   return o1.length() - o2.length();
               }
           }
       });

       String target = "";
       for (int i = 0; i < strArr.length; i++){
           if (!target.equals(strArr[i])){
               target = strArr[i];
               System.out.println(strArr[i]);
           }
       }

    }
}

