import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		BigInteger num = sc.nextBigInteger();
    		
    		if(num.remainder(new BigInteger("2")).compareTo(new BigInteger("0")) == 0) {
    			System.out.println("even");
    		}
    		else System.out.println("odd");
    	}
    	
    	sc.close();
    }
}