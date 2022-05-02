import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        int maxCount = 0;

        while (t > 0){
            String brStr = br.readLine();
            Integer bookCount = map.get(brStr);

            if (bookCount == null){
                bookCount = 0;
            }

            map.put(brStr, bookCount+1);

            if (maxCount == bookCount){
                list.add(brStr);
            } else if (maxCount < bookCount){
                list.clear();
                list.add(brStr);
                maxCount = bookCount;
            }
            t--;
        }

        if (list.size() > 1){
            list.sort(String.CASE_INSENSITIVE_ORDER);
        }
        System.out.println(list.get(0));

    }
}