import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true){
            String  result = "";
            String  x = sc.nextLine();
            // 글자 수
            int length = x.length();

            // 0인경우 종료
            if (x.equals("0")){
                sc.close();
                break;
            }

            // 한글자는 no
            if(length == 1){
                System.out.println("yes");
               continue;
            }

            boolean isOk = true;
            for (int i = 1; i < length ; i ++){
                if (x.charAt(length-1-i) != x.charAt(i)){
                    isOk = false;
                    result = "no";
                    break;
                }
            }
            if (isOk){
                result = "yes";
            }
            System.out.println(result);
        }
    }
}