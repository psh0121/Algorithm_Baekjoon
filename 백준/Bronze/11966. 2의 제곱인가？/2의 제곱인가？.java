import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	BigInteger n = sc.nextBigInteger();
    	
    	for(int i = 0; i <= 30; i++) {
    		if(n.compareTo(new BigInteger("2").pow(i)) == 0) {
    			System.out.println(1);
    			return;
    		}
    	}
    	
    	System.out.println(0);
    	sc.close();
    }
}