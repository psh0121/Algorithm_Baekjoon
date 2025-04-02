import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int[] heights = new int[n];

			for(int j = 0; j < n; j++) heights[j] = sc.nextInt();

			int peakCnt = 0;

			for(int j = 1; j < n - 1; j++) {
				if(heights[j] > heights[j - 1] && heights[j] > heights[j + 1]) {
					peakCnt++;
				}
			}

			System.out.printf("Case #%d: %d\n", i, peakCnt);
		}
		sc.close();
    }
}
