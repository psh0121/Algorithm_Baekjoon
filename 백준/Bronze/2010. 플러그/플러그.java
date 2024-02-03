import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		// 멀티탭 플러스 -1을 한 다음에(그 플러그에 또 멀티탭을 꽂을테니깐) cnt에 더한다. 
		// 단 마지막은 -1하지않고 cnt에 추가해준다. 
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int flagWhole = Integer.parseInt(st.nextToken());
			
			cnt += flagWhole-1;
			
			if(i == n - 1) cnt += 1;
		}
		
		System.out.println(cnt);
	}
}