import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int seed = sc.nextInt();
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();

		for(int a = 0; a < m; a++) {
			for(int c = 0; c < m; c++) {
				int val1 = (a * seed + c) % m;
				int val2 = (a * val1 + c) % m;

				if (val1 == x1 && val2 == x2) {
					System.out.println(a + " " + c);
					return;
				}
			}
		}
		sc.close();
    }
}