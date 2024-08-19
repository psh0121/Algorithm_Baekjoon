import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			int m = sc.nextInt();
			double[] arr = new double[m];

			for(int j = 0; j < m; j++) arr[j] = sc.nextDouble();

			// 정원 관리하기
			for(int j = 1; j <= m-2; j++) {
				double left = arr[j-1];
				double right = arr[j+1];

				double mid = (left + right) / 2;

				if(arr[j] > mid) arr[j] = mid;
			}

			System.out.println("Case #" + i + ": " + arr[m-2]);
		}
		sc.close();
    }
}
