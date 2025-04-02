import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();

		int compareA0 = a.compareTo(new BigInteger("0"));
		int compareB0 = b.compareTo(new BigInteger("0"));

		if(compareA0 == -1 && compareB0 >= 0) {
			System.out.println(a.divide(b).subtract(new BigInteger("1")));
			System.out.println(a.remainder(b).add(b));
		}
		else if (compareA0 == -1 && compareB0 == -1) {
			System.out.println(a.divide(b).add(new BigInteger("1")));
			System.out.println(a.remainder(b).subtract(b));
		}
		else {
			System.out.println(a.divide(b));
			System.out.println(a.remainder(b));
		}
		sc.close();
    }
}