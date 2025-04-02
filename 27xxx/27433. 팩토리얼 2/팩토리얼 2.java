import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		BigInteger result = new BigInteger("1");
		
		for(int i = 1; i <= num; i++) {
			result = result.multiply(new BigInteger(Integer.toString(i)));
		}
		
		System.out.println(result);
	}
}         
