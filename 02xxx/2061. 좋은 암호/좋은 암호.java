import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger k = new BigInteger(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		
		// 2부터 l까지 소수여부 파악할수 있는 배열 생성 
		boolean[] isPrime = new boolean[l+1];
		for(int i = 0; i < isPrime.length; i++) isPrime[i] = true;
		
		isPrime[0] = isPrime[1] = false;
		
		for(int i = 2; i <= Math.sqrt(l); i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= l; j += i) isPrime[j] = false;
			}
		}
		
		// isPrime에서 true인 것들만 k나눠서 나머지 값 여부따라 출력 
		for(int i = 2; i < l; i++) {
			if(!isPrime[i]) continue;
			
			BigInteger now = new BigInteger(Integer.toString(i));
			
			if(k.mod(now).compareTo(new BigInteger("0")) == 0) {
				System.out.println("BAD " + now);
				return;
			}
		}
		
		System.out.println("GOOD");
	}
}