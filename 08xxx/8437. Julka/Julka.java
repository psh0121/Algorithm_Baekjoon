import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger cnt = sc.nextBigInteger();
		BigInteger moreGetApple = sc.nextBigInteger();
		BigInteger two = new BigInteger("2");
		
		BigInteger Klaudia = ((cnt.subtract(moreGetApple)).divide(two)).add(moreGetApple);
		BigInteger Natalia = (cnt.subtract(moreGetApple)).divide(two);
		
		System.out.println(Klaudia);
		System.out.println(Natalia);
	}
}