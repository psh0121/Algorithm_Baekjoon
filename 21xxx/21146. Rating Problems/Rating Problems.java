import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int sum = 0;

		for(int i = 0; i < k; i++) {
			sum += sc.nextInt();
		}

		int minValue = (-3 * (n - k)) + sum;
		int maxValue = (3 * (n - k)) + sum;

		double avgMin = (double)minValue / n;
		double avgMax = (double)maxValue / n;

		System.out.println(avgMin + " " + avgMax);
		sc.close(); 
    }
}
