import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr);
		
		if(arr[1] - arr[0] == arr[2] - arr[1]) {
			if(arr[2] + (arr[2] - arr[1]) > 100) System.out.println(arr[0] - (arr[2] - arr[1]));
			else System.out.println(arr[2] + (arr[2] - arr[1]));
		}
		else if(arr[1] - arr[0] < arr[2] - arr[1]) {
			System.out.println(arr[2] - (arr[1] - arr[0]));
		}
		else System.out.println(arr[1] - (arr[2] - arr[1]));
	}
}

