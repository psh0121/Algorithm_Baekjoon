import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
          BigInteger num = sc.nextBigInteger();
          BigInteger i = BigInteger.ONE;
          HashMap<Character, Integer> map = new HashMap<>();

          while (map.size() != 10) {
            BigInteger value = num.multiply(i);
            String strValue = value.toString();

            for(int j = 0; j < strValue.length(); j++) {
              char key = strValue.charAt(j);

              if(!map.containsKey(key)) map.put(key, 1);
              else map.put(key, map.get(key) + 1);
            }

            if(map.size() < 10) i = i.add(BigInteger.ONE);
          }

          System.out.println(i);
        }
        sc.close();
    }
}
