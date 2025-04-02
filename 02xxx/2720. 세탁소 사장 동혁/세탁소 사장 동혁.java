import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] coin = new int[4];
		
		for(int i = 0; i < n; i++) {
			double dollar = sc.nextDouble() / 100;
			
			coin[0] = (int) (dollar / 0.25);
			dollar -= 0.25 * coin[0];
			dollar = Math.round(dollar * 100) / 100.0;
			
			coin[1] = (int) (dollar / 0.10);
			dollar -= 0.10 * coin[1];
			dollar = Math.round(dollar * 100) / 100.0;
			
			coin[2] = (int) (dollar / 0.05);
			dollar -= 0.05 * coin[2];
			dollar = Math.round(dollar * 100) / 100.0;
			
			coin[3] = (int) (dollar / 0.01);
			dollar -= 0.01 * coin[3];
			dollar = Math.round(dollar * 100) / 100.0;
			
			System.out.println(coin[0] + " " + coin[1] + " " + coin[2] + " " + coin[3]);
		}
		
	}
}

