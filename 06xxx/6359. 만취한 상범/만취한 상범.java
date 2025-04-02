import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			boolean[] open = new boolean[n+1];

			for(int j = 1; j <= n; j++) {
				for(int k = 1; k <= n; k++) {
					if(k % j == 0) {
						open[k] = !open[k];
					}
				}
			}

			int trueCnt = 0;

			for(int j = 1; j <= n; j++) {
				if(open[j]) trueCnt++;
			}

			System.out.println(trueCnt);
		}
		sc.close();
    }
}
