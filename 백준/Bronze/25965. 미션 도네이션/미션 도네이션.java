import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int m = sc.nextInt();
			long money = 0;

			int[] kArr = new int[m];
			int[] dArr = new int[m];
			int[] aArr = new int[m];

			for(int j = 0; j < m; j++) {
				kArr[j] = sc.nextInt();
				dArr[j] = sc.nextInt();
				aArr[j] = sc.nextInt();
			}

			int kill = sc.nextInt();
			int death = sc.nextInt();
			int assis = sc.nextInt();

			for(int j = 0; j < m; j++) {
				long point = ((long)kArr[j] * kill) - ((long)dArr[j] * death) + ((long)aArr[j] * assis);

				if(point <= 0) continue;
				else money += point;
			}

			System.out.println(money);
		}

		sc.close();
    }
}