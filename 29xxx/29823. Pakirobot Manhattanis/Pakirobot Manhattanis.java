import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		String[] directionArr = st.nextToken().split("");
		
		int[] nsew = {0, 0, 0, 0};
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			if(directionArr[i].equals("N")) nsew[0]++;
			else if(directionArr[i].equals("S")) nsew[1]++;
			else if(directionArr[i].equals("E")) nsew[2]++;
			else nsew[3]++;
		}
		
		result = Math.abs(nsew[0] - nsew[1]) + Math.abs(nsew[2] - nsew[3]);
		
		bw.write(result + "\n");
		
		bw.close();
	}
}         
