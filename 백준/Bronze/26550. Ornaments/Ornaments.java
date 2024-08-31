import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			BigInteger result = BigInteger.ZERO;

			for(int j = 1; j <= n; j++) {
				BigInteger layer = BigInteger.valueOf(j);
				BigInteger cnt = layer.multiply(layer.add(BigInteger.ONE)).divide(BigInteger.TWO);

				result = result.add(cnt);
			}
			System.out.println(result);
		}
        sc.close();
    }
}
