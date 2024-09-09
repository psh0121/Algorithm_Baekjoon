import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger n = sc.nextBigInteger();
		BigInteger num = BigInteger.ONE;

		while (n.compareTo(BigInteger.ZERO) >= 0) {
			n = n.subtract(num.multiply(num));
			num = num.add(BigInteger.ONE);
		}

		System.out.println(num.subtract(BigInteger.TWO));
		
		sc.close();
    }
}
