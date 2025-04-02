import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			int r = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			double result = 0.0;

			while (r > 0) {
				result += Math.PI * r * r;

				r *= a;
				if(r > 0) result += Math.PI * r * r;

				r /= b;
			}

			System.out.println("Case #" + i + ": " + result);
		}
		sc.close();
    }
}
