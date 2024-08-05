import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};

		double minValue = Double.MAX_VALUE;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;

		for(int i = 0; i < 4; i++) {

			for(int j = 0; j < 4; j++) {
				if(i == j) continue;

				for(int k = 0; k < 4; k++) {
					if (i == k || j == k) continue;

					for(int l = 0; l < 4; l++) {
						if (i == l || j == l || k == l) continue;

						double value = (double)num[i]/num[j] + (double)num[k]/num[l];

						if(value < minValue) {
							minValue = value;

							a = num[i];
							b = num[j];
							c = num[k];
							d = num[l];
						}
					}
				}
			}
		}

		System.out.printf("%d %d %d %d", a, b, c, d);
		sc.close(); 
    }
}
