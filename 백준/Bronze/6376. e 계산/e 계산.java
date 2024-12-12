import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
		System.out.println("n e");
		System.out.println("- -----------");

		double value = 0.0;

		for(int i = 0; i <= 9; i++) {
			double factorial = 1.0;

			for(int j = 1; j <= i; j++) {
				factorial *= j;
			}

			value += 1 / factorial;

			if(i <= 1) {
				System.out.printf("%d %.0f\n", i, value);
			}
			else if(i == 2) {
				System.out.printf("%d %.1f\n", i, value);
			}
			else System.out.printf("%d %.9f\n", i, value);
		}
		
    }
}
