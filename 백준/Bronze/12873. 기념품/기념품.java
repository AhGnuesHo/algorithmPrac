import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        //원형으로 앉기
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // 단계
        int level = 1;

        while (queue.size() > 1) {// 참가자가 한명만 남을 때 까지
            // 외쳐야 하는 수
            long count = (long)Math.pow(level,3);

            // 나머지만큼 큐 이동
            long mod = count % (queue.size());

            if (mod == 0){
                mod = queue.size();
            }
            if (mod != 1){
                for (long i = 1; i < mod; i++) {
                    int q = queue.poll();
                    queue.add(q);
                }
            }
            queue.remove();

            level++;
        }
        System.out.println(queue.poll());
    }
}
