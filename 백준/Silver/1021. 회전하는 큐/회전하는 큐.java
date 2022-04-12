import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        LinkedList<Integer> deque = new LinkedList<>();

        // 덱
        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {

            // 뽑아야 하는 수
            int target = sc.nextInt();

            while (deque.getFirst() != target) {
                // 2번 연산

                // 덱에서 타겟의 인덱스
                int targetIndex = deque.indexOf(target);

                if (targetIndex <= deque.size() / 2) {
                    deque.offerLast(deque.getFirst());
                    deque.remove();
                } else {
                    // 3번연산
                    deque.offerFirst(deque.pollLast());
                }
                count++;

            }

            // 덱의 맨 앞에 타겟 숫자가 오면 제거
            deque.remove();
        }
        System.out.println(count);

    }
}
