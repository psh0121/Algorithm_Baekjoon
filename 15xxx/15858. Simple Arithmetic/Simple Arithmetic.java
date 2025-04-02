import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();
		BigDecimal c = sc.nextBigDecimal();

		System.out.println(a.multiply(b).divide(c, 10, BigDecimal.ROUND_HALF_UP));
		sc.close();
    }
}