import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger num = sc.nextBigInteger();
		BigInteger num7 = new BigInteger("7");
		BigInteger num0 = new BigInteger("0");
		
		String strNum = "" + num;
		
		if(strNum.contains("7")) {
			if((num.remainder(num7)).compareTo(num0) == 0) {
				System.out.println(3);
			}
			else System.out.println(2);
		}
		else {
			if((num.remainder(num7)).compareTo(num0) == 0) {
				System.out.println(1);
			}
			else System.out.println(0);
		}
	}
}         
