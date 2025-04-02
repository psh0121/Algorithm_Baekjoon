import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			int cnt = i * i;

			if(cnt > 100) {
				System.out.println("*".repeat(100) + "...");
			}
			else {
				System.out.println("*".repeat(cnt));
			}
		}
        sc.close();
    }
}
