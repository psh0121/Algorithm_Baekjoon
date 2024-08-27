import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String value = sc.next();

			if (value.length() == 1) {
				System.out.println(value);
				continue;
			}
			
			StringBuilder sb = new StringBuilder(value);
			sb.reverse();
			String reverseValue = sb.toString();
			
			String[] arr = value.split("");

			System.out.println(value);
			for(int j = 1; j < arr.length -1; j++) {
				int left = j;
				int right = arr.length - 1 - j;

				System.out.println(arr[left] + " ".repeat(arr.length - 2) + arr[right]);
			}
			System.out.println(reverseValue);
		}
        sc.close();
    }
}
