import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		// 이진수로 나타낼 수 있는 최대수는 2^k - 1
		BigInteger two = BigInteger.TWO;
		BigInteger maxNum = two.pow(k).subtract(BigInteger.ONE);

		// 1~n까지의 합 계산 n*(n+1) / 2
		BigInteger sum = maxNum.multiply(maxNum.add(BigInteger.ONE)).divide(BigInteger.TWO);

		System.out.println(sum.toString(2));
		sc.close();
    }
}
