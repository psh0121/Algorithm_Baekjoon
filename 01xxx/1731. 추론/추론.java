import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

		if(arr[1] - arr[0] == arr[2] - arr[1]) {
			System.out.println((long)arr[n-1] + (arr[1] - arr[0]));
		}
		else {
			System.out.println((long)arr[n-1] * (arr[1] / arr[0]));
		}
		sc.close();
    }
}
