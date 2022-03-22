import java.io.*;

public class Main {

    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        Character[] arr = {'a', 'e', 'i', 'o', 'u'};

        while (true){
            String str = br.readLine().toLowerCase();
            if (str.equals("#")) break;
            int cnt = 0;

            for (Character character : arr) {
                for (int i = 0; i < str.length(); i ++){
                    if (str.charAt(i) == character){
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
        br.close();
    }
}