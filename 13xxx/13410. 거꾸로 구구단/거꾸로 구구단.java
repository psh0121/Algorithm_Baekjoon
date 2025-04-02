import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int maxValue = Integer.MIN_VALUE;
		
		for(int i = 1; i <= k; i++) {
			int value = n * i;
			String reverseStrValue = new StringBuilder(Integer.toString(value)).reverse().toString();
			int reverseValue = Integer.valueOf(reverseStrValue);

			maxValue = Math.max(maxValue, reverseValue);
		}

		System.out.println(maxValue);
		sc.close();
    }
}
