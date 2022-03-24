import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int n = sc.nextInt();

        int[] yeondu = count(name);
        
        int max = Integer.MIN_VALUE;
        String resultName = "";

        // 연산
        for (int k = 0; k < n ; k ++){
            String target = sc.next();
            int[] targetCount = count(target);
            int result = sum(yeondu, targetCount);

            if(max<result){
                max = result;
                resultName= target;
            }

            if (max == result && !resultName.equals("")){
                String[] dup = new String[2];
                dup[0] = resultName;
                dup[1] = target;
                Arrays.sort(dup);
                resultName = dup[0];
            }
        }
        System.out.println(resultName);

    }

    private static int[] count(String name){
        int[] count = new int[4];
        Arrays.fill(count, 0);
        for (int i = 0 ; i <name.length(); i ++ ){
            if (name.charAt(i) == 'L'){
                count[0]++;
            }if (name.charAt(i) == 'O'){
                count[1]++;
            }if (name.charAt(i) == 'V'){
                count[2]++;
            }if (name.charAt(i) == 'E'){
                count[3]++;
            }
        }
        return count;
    }

    private static int sum(int[] y, int[] t){
        int[] sum = new int[4];
        for(int i =0; i < 4; i++){
           sum[i] =  y[i]+t[i];
        }
        int L = sum[0];
        int O = sum[1];
        int V = sum[2];
        int E = sum[3];

       return  ((L+O) * (L+V)  *  (L+E)  *  (O+V)  *  (O+E)  *  (V+E)) % 100;
    }
}