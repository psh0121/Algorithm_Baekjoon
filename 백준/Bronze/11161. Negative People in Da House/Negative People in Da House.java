import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int cur = 0;
			int init = 0;

			for(int j = 0; j < m; j++) {
				int p1 = sc.nextInt();
				int p2 = sc.nextInt();

				cur = cur + p1 - p2;

				if(cur < init) init = cur;
			}

			System.out.println(Math.abs(init));
		}
		sc.close();
    }
}
