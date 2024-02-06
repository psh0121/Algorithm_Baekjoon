import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 7;
		int minNum = Integer.MAX_VALUE;
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			int number = sc.nextInt();
			
			if(number % 2 == 1) {
				sum += number;
				
				if(number < minNum) minNum = number;
			}
		}
		
		if(sum == 0) System.out.println(-1);
		
		else {
			System.out.println(sum);
			System.out.println(minNum);
		}
	}
}

