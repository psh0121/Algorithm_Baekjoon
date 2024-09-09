import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int k = 1; k <= t; k++) {
			int m = sc.nextInt();	// 참가자 수
			int n = sc.nextInt();	// 경기 일수
			int p = sc.nextInt();	// John의 ID

			int[][] arr = new int[m][n];

			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int sumValue = 0;

			for(int i = 0; i < n; i++) {
				int maxValue = 0;
				for(int j = 0; j < m; j++) {
					maxValue = Math.max(maxValue, arr[j][i]);
				}

				sumValue += (maxValue - arr[p-1][i]);
			}
			
			System.out.println("Case #" + k + ": " + sumValue);
		}

		
		sc.close();
    }
}
