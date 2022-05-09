import javax.naming.InterruptedNamingException;
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

        String[] serialArr = new String[n];

        for (int i = 0; i < n; i++){
            serialArr[i] = sc.next();
        }

        Arrays.sort(serialArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 길이가 같으면
                if (o1.length() == o2.length()){
                    // 문자열에 있는 숫자 비교
                    int sum1 = suminString(o1);
                    int sum2 = suminString(o2);

                    // 숫자의 합이 같으면 오름차순
                    if (sum1 == sum2){
                       return o1.compareTo(o2);
                    } else {
                        return sum1-sum2;
                    }
                }
                // 길이가 다르면 길이가 짧은 순서대로 리턴
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < n; i++){
            System.out.println(serialArr[i]);
        }
    }

    public static int suminString (String str){
        int result = 0;
        for (int i = 0; i < str.length(); i++){
            int charAt = str.charAt(i);
            if (charAt >= 48 && charAt <= 57) {
                result += charAt-48;
            }
        }
        return  result;
    }
}
