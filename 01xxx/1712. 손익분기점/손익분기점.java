import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger c = sc.nextBigInteger();

		if(b.compareTo(c) >= 0) {
			System.out.println(-1);
			return;
		}

		BigInteger calValue = a.divide(c.subtract(b)).add(BigInteger.ONE);

		System.out.println(calValue);
		sc.close();
    }
}
