import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sumA = 0;
		int sumB = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			sumA += a;
			sumB += b;

			System.out.println(sumA - sumB);
		}

        sc.close();
    }
}
