import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();
         int X = sc.nextInt();
         sc.nextLine();

         int[] arr = new int[N];
         for (int i =0; i < N; i++){
             arr[i] = sc.nextInt();
         }

         for (int k = 0; k < arr.length; k ++){
             if(arr[k] < X){
                 System.out.print(arr[k]+ " ");
             }
         }


    }
}
