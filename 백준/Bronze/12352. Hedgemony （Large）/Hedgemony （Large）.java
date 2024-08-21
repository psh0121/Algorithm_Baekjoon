import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			double[] arr = new double[n];
			for(int j = 0; j < n; j++) arr[j] = sc.nextDouble();

			for(int j = 1; j < n-1; j++) {
				double midValue = (arr[j+1] + arr[j-1]) / 2;

				if(arr[j] > midValue) arr[j] = midValue;
			}

			System.out.println("Case #" + i + ": " + arr[n-2]);
		}
		sc.close();
    }
}
