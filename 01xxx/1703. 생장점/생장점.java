import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 무한루프 
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			// 처음에 심는 것은 가지 하나에 잎이 하나 달린 묘목입니다. 
			int tree = 1;
			
			if(n == 0) break;
			
			for(int i = 0; i < n*2; i++) {
				int m = Integer.parseInt(st.nextToken());
				
				// 나란히 뻗어나온 가지와 가지치기수 
				if(i % 2 == 0) tree *= m;
				else tree -= m;
			}
			
			System.out.println(tree);
		}
	}
}