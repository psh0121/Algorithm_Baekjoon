import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		BigInteger bank1 = sc.nextBigInteger();
		BigInteger bank2 = sc.nextBigInteger();
		BigInteger sumBank = bank1.add(bank2);
		
		BigInteger chicken = sc.nextBigInteger().multiply(new BigInteger("2"));
		
		if(sumBank.compareTo(chicken) == -1) System.out.println(sumBank);
		else System.out.println(sumBank.subtract(chicken));
		
		sc.close();
	}
}         
