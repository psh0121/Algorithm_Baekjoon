import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();

		int minLen = Math.min(h, w);

		System.out.println(minLen * 100 / 2);
		sc.close();
    }
}