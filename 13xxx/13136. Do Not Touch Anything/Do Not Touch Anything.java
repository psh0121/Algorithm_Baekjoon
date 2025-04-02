import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double c = sc.nextInt();
		double range = sc.nextInt();
		
		BigInteger result = BigInteger.valueOf((long) Math.ceil(r / range)).multiply(BigInteger.valueOf((long) Math.ceil(c / range)));
		
		System.out.println(result);
		sc.close();
	}
}         
