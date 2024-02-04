import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n - 1;
		
		for(int i = 1; i <= n; i++) {
			System.out.println(" ".repeat(space--) + "*".repeat(2*i-1));
		}
	}
}