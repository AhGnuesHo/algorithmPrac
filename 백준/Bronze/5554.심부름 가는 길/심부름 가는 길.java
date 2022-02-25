import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int toSchool = Integer.parseInt(br.readLine());
        int toPCRoom = Integer.parseInt(br.readLine());
        int toAc = Integer.parseInt(br.readLine());
        int toHome = Integer.parseInt(br.readLine());

        int allSce = toAc + toHome + toPCRoom + toSchool;

        int min = allSce / 60;
        int sec = allSce - (min * 60);

        System.out.println(min);
        System.out.println(sec);

    }
}