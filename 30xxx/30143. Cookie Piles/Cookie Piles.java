import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = sc.nextInt();	// 가장짧은 쿠키개수
			int d = sc.nextInt();	// 간격

			int curCnt = a;
			int total = a;

			for(int j = 1; j < n; j++) {
				curCnt += d;
				total += curCnt;
			}

			System.out.println(total);

		}
		sc.close();
    }
}
