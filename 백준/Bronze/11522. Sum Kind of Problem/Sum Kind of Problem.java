import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int p = sc.nextInt();	// cnt
		
		for(int i = 0; i < p; i++) {
			int k = sc.nextInt();	// set number
			BigInteger n = sc.nextBigInteger();	// number

			BigInteger s1 = n.multiply(n.add(new BigInteger("1"))).divide(new BigInteger("2"));
			BigInteger s2 = n.multiply(n);
			BigInteger s3 = n.multiply(n.add(new BigInteger("1")));

			System.out.printf("%d %d %d %d\n", k, s1, s2, s3);
		}

    	sc.close();
    }
}