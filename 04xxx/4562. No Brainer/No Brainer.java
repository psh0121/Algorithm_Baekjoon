import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int eat, need;
		
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			
			eat = Integer.parseInt(st.nextToken());
			need = Integer.parseInt(st.nextToken());
			
			if(eat < need) System.out.println("NO BRAINS");
			else System.out.println("MMM BRAINS");
		}
	}
}         
