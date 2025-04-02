import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    BigInteger gisu = BigInteger.valueOf(2).pow(n);
    BigDecimal result = BigDecimal.ONE.divide(new BigDecimal(gisu));

    System.out.println(result.stripTrailingZeros().toPlainString());
		sc.close();
    }
}
