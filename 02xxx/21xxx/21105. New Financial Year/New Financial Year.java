import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			double p = sc.nextDouble();
			double c = sc.nextDouble();

			double o = (100 * p) / (c + 100);

			System.out.println(o);
		}

		sc.close(); 
    }
}
