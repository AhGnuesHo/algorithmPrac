import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());

      for (int i = 0; i < T; i++){
          StringTokenizer st = new StringTokenizer(br.readLine());
          Double num = Double.parseDouble(st.nextToken());
          String unit = st.nextToken();
          String u = Unit.change(unit, num);
          System.out.println(u);
      }
    }

    public enum Unit {
        KG(2.2046, "lb"),
        LB(0.4536, "kg"),
        L(0.2642, "g"),
        G(3.7854, "l");

        private final Double unit;
        private final String changU;

        Unit(Double unit, String changU){
            this.unit = unit;
            this.changU = changU;
        }

        public static String change(String unit, Double n){
            for (Unit u : Unit.values()){
                if (unit.toUpperCase().equals(u.name())){
                    String cal =  String.format("%.4f",u.unit * n) ;
                    return cal + " " + u.changU;
                }
            }
            return null;
        }
    }
}