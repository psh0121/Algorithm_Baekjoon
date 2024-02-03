import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		int total = 0;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int grade = Integer.parseInt(st.nextToken());
			
			if(grade == 3) {
				System.out.println("None");
				return;
			}
			
			total += grade;
		}
		
		if(total / n == 5) System.out.println("Named");
		else if((double)total / n >= 4.5) System.out.println("High");
		else System.out.println("Common");
	}
}