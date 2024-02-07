import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			int totalSum = 0;
			
			for(int j = 1; j <= value; j++) {
				int sum = 0;
				for(int k = 1; k <= j+1; k++) {
					sum += k;
				}
				sum *= j;
				totalSum += sum;
			}
			
			System.out.println(totalSum);
		}
	}
}

