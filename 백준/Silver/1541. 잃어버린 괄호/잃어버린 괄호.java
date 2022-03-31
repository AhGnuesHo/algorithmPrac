import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] n = br.readLine().split("-");
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i].contains("+")) {
                int plusValue = 0;
                String[] target = n[i].split("\\+");
                for (int j = 0; j < target.length; j++) {
                    plusValue += Integer.parseInt(target[j]);
                }
                n[i] = Integer.toString(plusValue);
            }
        }
        count = Integer.parseInt(n[0]);
        for (int j = 1; j < n.length; j++){
            count -= Integer.parseInt(n[j]);
        }
        System.out.println(count);
    }
}