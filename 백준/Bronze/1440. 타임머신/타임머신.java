import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String str = br.readLine();
        String[] arr = str.split(":");
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length; i++){
            for (int j = 0; j<length; j ++){
                for (int k = 0; k <length; k ++){
                    if (i != j && j != k && i != k){
                        if (Integer.parseInt(arr[i]) >=1 && Integer.parseInt(arr[i]) <= 12){
                            if (Integer.parseInt(arr[k]) >= 0 && Integer.parseInt(arr[k])<=59){
                                if (Integer.parseInt(arr[j])>= 0 && Integer.parseInt(arr[j]) <=59){
                                    count++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}