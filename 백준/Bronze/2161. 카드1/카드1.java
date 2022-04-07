import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++){
            queue.add(i);
        }


        for (int i = 0; i < n; i++) {
            if (queue.size() > 2) {
                System.out.print(queue.poll() + " ");
                queue.add(queue.poll());
            } else {
                System.out.print(queue.poll() + " ");
            }
        }
    }
}