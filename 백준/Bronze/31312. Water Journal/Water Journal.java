import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		boolean containMin = false;
		boolean containMax = false;
		
		for(int i = 0; i < n-1; i++) {
			st = new StringTokenizer(br.readLine());
			int cup = Integer.parseInt(st.nextToken());
			
			if(cup < min || cup > max) {
				System.out.println(-1);
				return;
			}
			
			if(cup == min) containMin = true;
			if(cup == max) containMax = true;
		}
		
		if(containMin && containMax) {
			for(int i = min; i <= max; i++) System.out.println(i);
		}
		else if(containMin) System.out.println(max);
		else if(containMax) System.out.println(min);
		else System.out.println(-1);
	}
}