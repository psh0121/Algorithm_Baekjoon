import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String str = sc.next();
            if(str.equals("0")) break;

            BigInteger value = BigInteger.ZERO;

            for(int i = 0; i < str.length(); i++) {
                int num = str.charAt(i) - '0';

                BigInteger calValue = BigInteger.valueOf(num);
                BigInteger skew = BigInteger.TWO.pow(str.length() - i).subtract(BigInteger.ONE);
                
                calValue = calValue.multiply(skew);
                value = value.add(calValue);
            }

            System.out.println(value);
        }
        sc.close();
    }
}