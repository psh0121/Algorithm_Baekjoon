import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();

		double oneA = b / a;
		double oneB = a / b;

		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			double num = sc.nextDouble();
			String alpha = sc.next();

			if(alpha.equals("A")) {
				System.out.printf("%.12f\n", oneA * num);
			}
			else System.out.printf("%.12f\n", oneB * num);
		}
		sc.close();
    }
}
