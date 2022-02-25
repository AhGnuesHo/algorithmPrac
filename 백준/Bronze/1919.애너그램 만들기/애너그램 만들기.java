import java.util.Scanner;
public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      String f  = sc.nextLine();
      String s  = sc.nextLine();

      char[] fArr = strToArr(f); //aabbcc
      char[] sArr = strToArr(s); //ddaarr

        int cnt = 0;
      for (int i = 0; i< fArr.length; i++){

          for (int j =0; j< sArr.length; j++){
              char a = fArr[i];
              char b =  sArr[j];
              if (a == b){
                  fArr[i] = ' ';
                  sArr[j] = ' ';
                  break;
              }
          }
      }
      int fResult =   getCnt(fArr);
      int sResult =   getCnt(sArr);
        System.out.println(fResult+sResult);
    }

    private static char[] strToArr(String str) {
        char[] arr = new char[str.length()];

        for (int i = 0; i <str.length(); i++){
            arr[i] =  str.charAt(i);
        }

        return  arr;
    }

    private static int getCnt(char[] arr){
        int cnt = 0;
        for (int i =0; i < arr.length; i++){
            if (arr[i] != ' '){
                cnt++;
            }
        }
        return cnt;
    }

}
