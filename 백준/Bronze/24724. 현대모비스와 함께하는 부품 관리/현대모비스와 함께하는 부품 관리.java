import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for(int i = 1; i <= t; i++) {
			int n = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int l1 = Integer.parseInt(st.nextToken());
			int l2 = Integer.parseInt(st.nextToken());

			for(int j = 0; j < n; j++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st2.nextToken());
				int b = Integer.parseInt(st2.nextToken());
			}

			System.out.println("Material Management " + i);
			System.out.println("Classification ---- End!");
		}

		br.close();
    }
}