import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

		long result = 0;

		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				result += Math.abs(arr[i] - arr[j]);
			}
		}

		System.out.println(result * 2);
		sc.close();
    }
}
