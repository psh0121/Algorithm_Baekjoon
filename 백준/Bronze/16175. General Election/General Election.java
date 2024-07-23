import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		// n 후보자 m 투표지역
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] voteRes = new int[n];

			for(int j = 0; j < m; j++) {
				for(int k = 0; k < n; k++) {
					voteRes[k] += sc.nextInt();
				}
			}

			int maxNum = Integer.MIN_VALUE;
			int maxIdx = 0;

			for(int j = 0; j < n; j++) {
				if(voteRes[j] > maxNum) {
					maxNum = voteRes[j];
					maxIdx = j;
				}
			}

			System.out.println(maxIdx + 1);
		}
		sc.close();
    }
}
