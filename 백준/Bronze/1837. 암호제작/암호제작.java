import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger p = new BigInteger(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		// 반복문1) isPrime을 k+1개만큼 만들되 초기값을 true로 설정한다 
		boolean[] isPrime = new boolean[k + 1];
		
		for(int i = 0; i < isPrime.length; i++) isPrime[i] = true;
		isPrime[0] = isPrime[1] = false;
		
		// 반복문2) 모든값이 true로 되어있는 isPrime에 소수가 아닌것은 false로 설정 
		for(int i = 2; i <= Math.sqrt(k); i++) {
			if(isPrime[i]) {
				for(int j = i*i; j <= k; j += i) isPrime[j] = false;
			}
		}
		
		// 반복문3) isPrime을 k까지 돌려 p를 나누었을때 나누어지는지 여부에 따라 값 출력 
		for(int i = 2; i < k; i++) {
			if(!isPrime[i]) continue;
			
			BigInteger now = new BigInteger(Integer.toString(i));
			
			if(p.mod(now).compareTo(new BigInteger("0")) == 0) {
				System.out.println("BAD " + now);
				return;
			}
		}
		
		System.out.println("GOOD");
	}
}