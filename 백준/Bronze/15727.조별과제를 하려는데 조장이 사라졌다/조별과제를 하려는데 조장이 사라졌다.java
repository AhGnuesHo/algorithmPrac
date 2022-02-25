import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int toM = Integer.parseInt(br.readLine());
        if ( toM % 5 == 0){
            System.out.print(toM / 5 );
        } else {
        System.out.print(toM / 5 + 1);
        }
    }
}