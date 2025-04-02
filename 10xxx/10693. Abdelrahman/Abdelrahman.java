import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			int computer = sc.nextInt();
			int line = sc.nextInt();

			System.out.println("Case " + i + ": " + (line - computer + 1));
		}
		sc.close();
    }
}
