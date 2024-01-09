import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	
	public static BigInteger fact(int a, int n) {
		BigInteger result = BigInteger.valueOf(a);
		
		if(a < n) {
			int b = (a + n) / 2;
			
			result = fact(a, b).multiply(fact(b + 1, n));
		}
		
		return result;
	}

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		
		System.out.println(fact(1, num));
	}
}         
