import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger curMoney = sc.nextBigInteger();
		BigInteger divideMoney = sc.nextBigInteger();
		
		
		System.out.println(curMoney.divide(divideMoney));
		System.out.println(curMoney.remainder(divideMoney));
	}

}