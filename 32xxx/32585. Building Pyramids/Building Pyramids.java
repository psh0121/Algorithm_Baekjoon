import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static BigInteger totalSum(BigInteger num) {
		return (num.multiply(num.add(BigInteger.ONE))).divide(BigInteger.TWO);
	}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger result = BigInteger.ZERO;

		for(int i = n; i >= 1; i--) {
			result = result.add(totalSum(BigInteger.valueOf(i)));
		}

		System.out.println(result);
        sc.close();
    }
}
