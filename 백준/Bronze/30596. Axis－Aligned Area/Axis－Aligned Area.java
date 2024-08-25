import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr);

		int num1 = Math.min(arr[0], arr[1]);
		int num2 = Math.min(arr[2], arr[3]);

		System.out.println(num1 * num2);
        sc.close();
    }
}
