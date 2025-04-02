import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    BigInteger n = new BigInteger(sc.next());

    int cnt = 0;
    
    BigInteger correctN = BigInteger.ONE;
    for(int i = 1; i <= 64; i++) {
      correctN = correctN.multiply(BigInteger.TWO);

      if(correctN.compareTo(n) == 1) {
        cnt = i;
        break;
      }
    }

    while(correctN.compareTo(BigInteger.ONE) != 0) {
      BigInteger differNum = correctN.subtract(n);

      if(differNum.compareTo(BigInteger.ONE) == 0) {
        System.out.println(cnt);
        break;
      }

      cnt--;
      n = n.divide(BigInteger.TWO);
      correctN = correctN.divide(BigInteger.TWO);
    }
		sc.close();
    }
}
