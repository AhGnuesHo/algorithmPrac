import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] month = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
        String[] day ={ "SUN" , "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int allDay = 0;
        for (int i = 0; i < x; i ++){
           allDay += month[i];
        }
        System.out.println(day[(allDay + y)%7]);
    }
}