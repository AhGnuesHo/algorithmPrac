import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        int result = 0;
        int[] arr = new int[3];
            
        for (int i = 0; i<3; i ++){
            int num = sc.nextInt();
            arr[i] = num;
        }
        
        int max = 0;
        int equal = 1;
        int equalNum = 0;
        int num = 0;
        
        for (int q = 0; q < arr.length-1; q++){
            for (int k = 1; k< arr.length; k++){
                if (k==q) {
                    continue;
                }
                if (arr[q] == arr[k]){

                    equal++;


                    equalNum = arr[q];
                } 
            }
        }
       
        if (equal == 1){
            for (int q = 0; q < arr.length; q++){
                	num = arr[q];                                  
                        if (max < num){
                            max = num;
                        } 
				 }
            result = max * 100;
        } else if (equal == 4) {
            result = 10000 + equalNum * 1000;
        } else if (equal == 2){
            result = 1000 + equalNum * 100;
        }

        System.out.println(result);

    }

}