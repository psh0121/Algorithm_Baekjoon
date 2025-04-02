import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < cnt; i++) {
			BigInteger lt = sc.nextBigInteger();
			BigInteger wt = sc.nextBigInteger();
			BigInteger le = sc.nextBigInteger();
			BigInteger we = sc.nextBigInteger();
			
			BigInteger telecomParisTech = lt.multiply(wt);
			BigInteger eurecom = le.multiply(we);
			
			if(telecomParisTech.compareTo(eurecom) == 1) System.out.println("TelecomParisTech");
			else if(telecomParisTech.compareTo(eurecom) == -1) System.out.println("Eurecom");
			else System.out.println("Tie");
		}
	}
}  