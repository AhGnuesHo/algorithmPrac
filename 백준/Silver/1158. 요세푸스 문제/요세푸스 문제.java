import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Queue<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; i++){
            list.add(i);
        }
        System.out.print("<");

       while (n > 0) {
          for (int i = 1; i < k; i ++){
              int index = list.poll();
              list.offer(index);
          }
          n--;
          if (n == 0){
              System.out.print(list.poll());
          } else {
          System.out.print(list.poll() + ", ");
          }
       }
        System.out.print(">");
    }
}
