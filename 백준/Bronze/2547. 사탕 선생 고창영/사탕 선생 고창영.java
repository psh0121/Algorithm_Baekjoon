import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			
			int student = Integer.parseInt(sc.nextLine());
			BigInteger candy = new BigInteger("0");
			
			for(int j = 0; j < student; j++) {
				candy = candy.add(new BigInteger(sc.nextLine()));
			}
			
			if(candy.remainder(new BigInteger("" + student)).compareTo(new BigInteger("0")) == 0) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}

