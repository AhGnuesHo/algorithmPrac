import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            Integer x = 0;

            switch (command){
                case "push_front" :
                    x = Integer.parseInt(st.nextToken());
                    deque.offerFirst(x);
                    break;
                case "push_back" :
                    x = Integer.parseInt(st.nextToken());
                    deque.offerLast(x);
                    break;
                case "pop_front":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(deque.pollFirst()).append('\n');
                    }
                    break;
                case "pop_back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(deque.pollLast()).append('\n');
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append('\n');
                    break;
                case "empty":
                    if (deque.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    x = deque.peekFirst();
                    if (x == null){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(x).append("\n");
                    }
                    break;

                case "back":
                    x = deque.peekLast();
                    if (x == null){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(x).append("\n");
                    }
                    break;
            }

        }
        sb.setLength(sb.length() - 1);
            System.out.println(sb);

    }


}
