import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int winner = 0;
		int maxGrade = Integer.MIN_VALUE;
		
		for(int i = 1; i <= 5; i++) {
			int sum = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
			
			if(sum > maxGrade) {
				winner = i;
				maxGrade = sum;
			}
		}
		
		System.out.println(winner + " " + maxGrade);
	}
}

