import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double v = 0.0;

		for(int i = 0; i < n; i++) {
			double a = sc.nextDouble() / 100;
			double afterV = 1 - ((1 - v) * (1 - a));

			System.out.println(afterV * 100);
			v = afterV;
		}
		sc.close();
    }
}