import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();

		System.out.println((n+1) + " " + (k*n + 1));
		sc.close();
    }
}
