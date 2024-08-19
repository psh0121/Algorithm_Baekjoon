import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] sortArr = new int[n];

		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			sortArr[i] = num;
		}
		Arrays.sort(sortArr);

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i] == sortArr[j]) {
					System.out.println(j+1);
					break;
				}
			}
		}
		sc.close();
    }
}
