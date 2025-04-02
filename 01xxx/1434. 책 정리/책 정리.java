import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[n];	// box
		int[] b = new int[m];	// book

		for(int i = 0; i < n; i++) a[i] = sc.nextInt();
		for(int i = 0; i < m; i++) b[i] = sc.nextInt();

		int boxIdx = 0;
		int result = 0;

		for(int i = 0; i < m; i++) {
			while (boxIdx < n) {
				if(a[boxIdx] >= b[i] && a[boxIdx] != 0) {
					a[boxIdx] -= b[i];
					break;
				}
				else {
					result += a[boxIdx];
					boxIdx++;
				}
			}
		}

		while (boxIdx < n) {
			result += a[boxIdx];
			boxIdx++;
		}

		System.out.println(result);
		sc.close();
    }
}
