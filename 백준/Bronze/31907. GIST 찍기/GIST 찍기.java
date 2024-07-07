import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			System.out.println("G".repeat(n) + ".".repeat(n * 3));
		}

		for(int i = 0; i < n; i++) {
			System.out.println(".".repeat(n) + "I".repeat(n) + ".".repeat(n) + "T".repeat(n));
		}

		for(int i = 0; i < n; i++) {
			System.out.println(".".repeat(n * 2) + "S".repeat(n) + ".".repeat(n));
		}
		sc.close();
    }
}