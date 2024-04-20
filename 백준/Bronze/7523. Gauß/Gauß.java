import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	BigInteger result = new BigInteger("0");
    	
    	BigInteger zero = new BigInteger("0");
    	BigInteger one = new BigInteger("1");
    	BigInteger two = new BigInteger("2");
    	
    	for(int i = 1; i <= n; i++) {
    		result = zero;
    		
    		BigInteger start = sc.nextBigInteger();
    		BigInteger end = sc.nextBigInteger();
    		
    		BigInteger cnt = end.subtract(start).add(new BigInteger("1"));
    		
    		// 개수가 나누어 떨어진다면 
    		if(cnt.remainder(two).compareTo(zero) == 0) {
    			result = (start.add(end)).multiply(cnt.divide(two));
    		}
    		// 나누어 떨어지지 않는다면 
    		else {
    			result = (start.add(end)).multiply(cnt.divide(two));
    			result = result.add((start.add(end)).divide(two));
    		}
    		
    		System.out.println("Scenario #" + i + ":");
    		System.out.println(result);
    		System.out.println();
    	}
    			
    	sc.close();
    }
}