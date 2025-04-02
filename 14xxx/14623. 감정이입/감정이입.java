import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String b1 = sc.next();
		String b2 = sc.next();

		BigInteger num1 = new BigInteger(b1, 2);
		BigInteger num2 = new BigInteger(b2, 2);

		BigInteger calNum = num1.multiply(num2);

		System.out.println(calNum.toString(2));
		sc.close();
    }
}
