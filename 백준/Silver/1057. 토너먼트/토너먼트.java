import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int kim = sc.nextInt();
        int im = sc.nextInt();

        int count = 0;

        while(kim!=im){
            kim = kim/2+kim%2;
            im = im/2+im%2;
            count++;
        }
        System.out.println(count);
    }
}





