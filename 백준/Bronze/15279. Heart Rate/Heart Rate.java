import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			double b = sc.nextDouble();
			double p = sc.nextDouble();

			double minABPM = 60 * (b - 1) / p;
			double bpm = 60 * b / p;
			double maxABPM = 60 * (b + 1) / p;

			System.out.printf("%.4f %.4f %.4f\n", minABPM, bpm, maxABPM);
		}
		
		sc.close();
    }
}
