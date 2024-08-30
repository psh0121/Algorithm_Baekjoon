import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int value = Math.min(n, m);

		if ((n-value) % 2 == 1 || (m-value) % 2 == 1) {
			System.out.println((value * 2) + 1);
		}
		else System.out.println(value * 2);
        sc.close();
    }
}
