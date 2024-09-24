import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		BigInteger shortMin = new BigInteger("-32768");
		BigInteger shortMax = new BigInteger("32767");

		BigInteger intMin = new BigInteger("-2147483648");
		BigInteger intMax = new BigInteger("2147483647");

		BigInteger longMin = new BigInteger("-9223372036854775808");
		BigInteger longMax = new BigInteger("9223372036854775807");

		BigInteger n = sc.nextBigInteger();

		if(n.compareTo(shortMin) >= 0 && n.compareTo(shortMax) <= 0) {
			System.out.println("short");
		}
		else if (n.compareTo(intMin) >= 0 && n.compareTo(intMax) <= 0) {
			System.out.println("int");
		}
		else System.out.println("long long");

		sc.close();
    }
}
