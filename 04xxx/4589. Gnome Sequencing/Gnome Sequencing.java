import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		int num1, num2, num3;
		
		System.out.println("Gnomes:");
		
		for(int i = 0; i < cnt; i++) {
			st = new StringTokenizer(br.readLine());
			
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			num3 = Integer.parseInt(st.nextToken());
			
			if(num1 > num2) {
				if(num2 > num3) System.out.println("Ordered");
				else System.out.println("Unordered");
			}
			else {
				if(num3 > num2) System.out.println("Ordered");
				else System.out.println("Unordered");
			}
		}
	}
}         
