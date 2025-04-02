import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		String cal = sc.next();
		BigInteger b = sc.nextBigInteger();
		
		if(cal.equals("+")) System.out.println(a.add(b));
		else System.out.println(a.multiply(b));
	}
}

