import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	
    	for(int i = 0; i < n; i++) {
    		BigInteger a1 = sc.nextBigInteger();
    		BigInteger a2 = sc.nextBigInteger();
    		
    		System.out.println(a1.divide(a2));
    		System.out.println(a1.remainder(a2));
    		System.out.println();
    	}
    	
    	sc.close();
    }
}