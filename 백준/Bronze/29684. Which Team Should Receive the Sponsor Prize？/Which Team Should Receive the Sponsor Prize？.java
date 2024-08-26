import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
			int n = sc.nextInt();
			if(n == 0) break;

			int turn = 0;
			int value = 0;
			int minDis = Integer.MAX_VALUE;

			for(int i = 0; i < n; i++) {
				int time = sc.nextInt();
				int absValue = Math.abs(2023-time);

				if(absValue < minDis) {
					minDis = absValue;
					value = time;
					turn = i+1;
				}
			}

			System.out.println(turn);
		}
        sc.close();
    }
}
