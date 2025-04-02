import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String number = sc.next();
		BigInteger result = BigInteger.ZERO;

		for(int i = 0; i < number.length(); i++) {
			char num = number.charAt(i);
			int intNum = num -'0';
			BigInteger pow5Num = BigInteger.valueOf((long)Math.pow(intNum, 5));
			result = result.add(pow5Num);
		}

		System.out.println(result);
		sc.close();
    }
}
