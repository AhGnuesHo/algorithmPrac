import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;


public class Main {
    public static void main(String[] args) {

        // 1-10000이 모두 생성자가 있다고 가정
        boolean [] isNotN = new boolean[10000];
        Arrays.fill(isNotN, true);

        // i에 의해 만들어진 n은 또 다른 수의 생성자가 될 수 있음
        // n은 생성자가 있는 수
        for (int i = 0; i <= 10000 ; i++){
           Integer n =  selfNum(i);
           // i는 N의 생성자임. 33은 39의 생성자
            if(n < 10000){
                isNotN[n] = false;
            }
        }

        for (int j = 0; j < isNotN.length; j++){
            if (isNotN[j]){
                System.out.println(j);
            }
        }

    }

    // 생성자 입력
    // target 33
    public static Integer selfNum(int target){

        int dn = target;
        // 생성자 한 글자씩 분리
        while (target > 0){
            dn += target % 10;
            target = target / 10;

        }
        return dn;


    }
}



