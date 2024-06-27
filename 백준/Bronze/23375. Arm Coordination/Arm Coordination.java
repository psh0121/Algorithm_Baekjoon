import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long y = sc.nextLong();
		long r = sc.nextLong();

		System.out.printf("%d %d\n", x+r, y+r);
		System.out.printf("%d %d\n", x+r, y-r);
		System.out.printf("%d %d\n", x-r, y-r);
		System.out.printf("%d %d\n", x-r, y+r);

		sc.close();
    }
}