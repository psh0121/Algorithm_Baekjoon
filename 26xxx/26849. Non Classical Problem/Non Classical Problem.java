import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		double[] arr = new double[n];

		double sum = 0.0;

		for(int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();

			double value = a / b;
			arr[i] = value;
			sum += value;
		}

		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1] + " " + sum);
        sc.close();
    }
}
