import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
	public static BigInteger fact(int n) {
		if(n <= 0) return new BigInteger("1");
		return new BigInteger(Integer.toString(n)).multiply(fact(n-1));
	}
	
	public static BigInteger bc(int n, int k) {
		if(k < 0 || k > n) return new BigInteger("0");
		return fact(n).divide(fact(n-k).multiply(fact(k)));
	}
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 5;
        
        System.out.println(bc(n, k));
    }
}