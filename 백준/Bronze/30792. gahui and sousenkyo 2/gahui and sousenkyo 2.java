import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		int cheerupChar =Integer.parseInt(sc.nextLine());
		String[] arr = sc.nextLine().split(" ");

		int[] numArr = new int[n];

		numArr[0] = cheerupChar;

		for(int i = 1; i < n; i++) {
			numArr[i] = Integer.parseInt(arr[i - 1]);
		}

		Arrays.sort(numArr);

		int result = 0;

		for(int i = 0; i < n; i++) {
			if(numArr[i] == cheerupChar) {
				result = n - i;
				break;
			}
		}

		System.out.println(result);
		sc.close();
    }
}
