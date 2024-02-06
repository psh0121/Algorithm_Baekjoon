import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 9;
		int maxNum = Integer.MIN_VALUE;
		int row = 0;
		int col = 0;
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				int number = sc.nextInt();
				
				if(number > maxNum) {
					maxNum = number;
					row = i;
					col = j;
				}
			}
		}
		
		System.out.println(maxNum);
		System.out.println(row + " " + col);
	}
}

