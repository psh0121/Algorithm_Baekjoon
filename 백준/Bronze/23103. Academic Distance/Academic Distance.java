import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		for(int i = 0; i < n; i++) {
			if(i == 0) {
				a = sc.nextInt();
				b = sc.nextInt();
				continue;
			}

			c = sc.nextInt();
			d = sc.nextInt();

			result += Math.abs(a - c) + Math.abs(b - d);

			a = c;
			b = d;
		}

		System.out.println(result);
		sc.close();
    }
}
