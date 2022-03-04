import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      char[] target = new char[]{'C','A','M','B','R','I','D','G','E'};
      for (int i = 0; i < str.length(); i++){
          char s = str.charAt(i);
          for (int j = 0; j < target.length; j++){
              if (s == target[j]){
                  str = str.replace(s,' ');
              }
          }
      }
      System.out.println(str.replaceAll(" ", ""));
    }
}
