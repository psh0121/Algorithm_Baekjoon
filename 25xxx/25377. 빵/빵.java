import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.MAX_VALUE;
		int cnt = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cnt; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int walkT = Integer.parseInt(st.nextToken());
			int breadT = Integer.parseInt(st.nextToken());
			
			if(walkT > breadT) continue;
			min = Math.min(min, breadT);
		}
		
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
		
		br.close();
	}
}         