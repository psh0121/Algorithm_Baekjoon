import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int p = sc.nextInt();	// testcase

		for(int i = 0; i < p; i++) {
			BigInteger num = new BigInteger(sc.next());

			System.out.println(num
				.multiply(num.add(new BigInteger("1")))
				.multiply(new BigInteger("2").multiply(num).add(new BigInteger("1")))
				.divide(new BigInteger("6"))
			);
		}

    	sc.close();
    }
}