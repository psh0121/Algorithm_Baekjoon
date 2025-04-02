import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.next());

		String strNum2 = sc.next();
		BigInteger num2 = new BigInteger(strNum2);
		String[] num2Arr = strNum2.split("");

		System.out.println(num1);
		System.out.println(num2);

		for(int i = num2Arr.length - 1; i >= 0; i--) {
			BigInteger num = new BigInteger(num2Arr[i]);
			System.out.println(num1.multiply(num));
		}

		System.out.println(num1.multiply(num2));
        sc.close();
    }
}
