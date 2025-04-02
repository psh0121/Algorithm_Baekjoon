import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr);
		
		int result = Math.max(arr[2] - arr[1], arr[1] - arr[0]);
		
		System.out.println(result > 1 ? result -1 : 0);
	}
}

