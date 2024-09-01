import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double val1 = (-b + Math.sqrt(b * b - (4 * a * c)))/ (2 * a);
			double val2 = (-b - Math.sqrt(b * b - (4 * a * c)))/ (2 * a);

			if(val1 > val2) {
				System.out.printf("%.3f, %.3f\n", val1, val2);
			}
			else {
				System.out.printf("%.3f, %.3f\n", val2, val1);
			}
		}
        sc.close();
    }
}
