import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int f  = sc.nextInt();
      sc.nextLine();
      for (int i = 0; i < f; i++){
        String s  = sc.nextLine();
        String[] array = s.split("-");

        int strValue = 0;
        for (int k = 0; k < 3; k++){
            String str = array[0];
            char c = str.charAt(k);
            int value =  (c - 'A');
            value *= (Math.pow(26, 2-k));
            strValue += value;
        }
        int intValue = Integer.parseInt(array[1]);

        if (Math.abs(strValue - intValue) <= 100){
            System.out.println("nice");
        } else {
            System.out.println("not nice");
        }
      }
    }
}
