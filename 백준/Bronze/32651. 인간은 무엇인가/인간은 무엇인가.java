import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(n % 2024 == 0 && n <= 100000 ? "Yes" : "No");

		sc.close();
    }
}
