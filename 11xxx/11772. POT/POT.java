import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	BigInteger result = new BigInteger("0");
    	
    	for(int i = 0; i < n; i++) {
    		String num = sc.next();
    		
    		BigInteger base = new BigInteger(num.substring(0, num.length() - 1));
    		int exponent = Integer.parseInt(num.substring(num.length() - 1));
    		
    		result = result.add(base.pow(exponent));
    	}
    	
    	System.out.println(result);
    	
    	sc.close();
    }
}