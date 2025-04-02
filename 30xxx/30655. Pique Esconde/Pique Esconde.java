import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String[] line = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int m = Integer.parseInt(line[1]);

			if(n == 0 && m == 0) break;

			boolean[] found = new boolean[n+1];

			for(int i = 1; i < n - 1; i++) {
				int kid = Integer.parseInt(br.readLine());
				found[kid] = true;
			}

			for(int i = 1; i <= n; i++) {
				if(!found[i] && i != m) {
					sb.append(i).append("\n");
					break;
				}
			}
		}

		System.out.println(sb);
    }
}
