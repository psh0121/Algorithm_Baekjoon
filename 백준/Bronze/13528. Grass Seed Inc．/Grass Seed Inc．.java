import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c = sc.nextDouble();
		int l = sc.nextInt();

		double sum = 0.0;

		for(int i = 0; i < l; i++) {
			double wi = sc.nextDouble();
			double li = sc.nextDouble();

			sum += wi * li * c;
		}

		System.out.println(sum);
		sc.close();
    }
}
