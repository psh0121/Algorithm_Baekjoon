import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			BigInteger sum = new BigInteger("0");
			
			for(int i = 0; i < n; i++) {
				sum = sum.add(sc.nextBigInteger());
			}
			
			if(sum.compareTo(new BigInteger("0")) == -1) System.out.println("-");
			else if(sum.compareTo(new BigInteger("0")) == 0) System.out.println("0");
			else System.out.println("+");
		}
	}
}