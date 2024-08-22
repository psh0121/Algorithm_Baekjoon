import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			int[] nArr = new int[n];
			int[] mArr = new int[m];

			for(int j = 0; j < n; j++) nArr[j] = sc.nextInt();
			for(int j = 0; j < m; j++) mArr[j] = sc.nextInt();

			if(n <= m) System.out.println("Yes");
			else System.out.println("No");
		}
        sc.close();
    }
}
