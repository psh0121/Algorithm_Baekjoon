import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();	//testcase

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();

			int minNum = Integer.MAX_VALUE;
			int maxNum = Integer.MIN_VALUE;

			for(int j = 0; j < n; j++) {
				int num = sc.nextInt();

				minNum = Math.min(minNum, num);
				maxNum = Math.max(maxNum, num);
			}

			System.out.printf("%d %d\n", minNum, maxNum);
		}
    	sc.close();
    }
}