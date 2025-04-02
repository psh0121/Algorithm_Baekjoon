import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int sum = 0;
			int[] arr = new int[5];

			for(int j = 0; j < 5; j++) arr[j] = sc.nextInt();

			Arrays.sort(arr);

			if(arr[3] - arr[1] >= 4) {
				sum = 0;
			}
			else {
				sum = arr[1] + arr[2] + arr[3];
			}

			System.out.println(sum == 0 ? "KIN" : sum);
		}
		sc.close();
    }
}
