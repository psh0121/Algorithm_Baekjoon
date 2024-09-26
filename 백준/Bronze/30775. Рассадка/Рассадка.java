import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int k = sc.nextInt();

		BigInteger totalCnt = BigInteger.ZERO;

		for(int i = 0; i < k; i++) {
			totalCnt = totalCnt.add(new BigInteger(sc.next()));
		}

		// 평균 인원수
		BigInteger avg = totalCnt.divide(BigInteger.valueOf(m));

		// 나머지
		BigInteger mod = totalCnt.remainder(BigInteger.valueOf(m));

		BigInteger maxValue = avg.add(mod.compareTo(BigInteger.ZERO) > 0 ? BigInteger.ONE : BigInteger.ZERO);

		System.out.println(maxValue);
		sc.close();
    }
}
