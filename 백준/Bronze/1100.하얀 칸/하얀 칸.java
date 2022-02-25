import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

        int cnt = 0;
        // j가 짝수이고, i가 짝수이면 흰판 00 02 04 06 20 22 24 26
        // j가 홀수이고, i가 홀수이면 흰판  11 13 15 17 31 33 35 37
        for (int j = 0; j < 8; j++) {
                String exist = sc.nextLine();;
            for (int i = 0; i < 8; i++) {

                char c = exist.charAt(i);

                if (c != 'F') continue;

                if (j % 2 == 0){
                    if (i % 2 == 0){
                        cnt++;
                    }
                } else {
                    if (i % 2 != 0){
                        cnt++;
                    }
                }

            }
        }
        System.out.println(cnt);

    }
}