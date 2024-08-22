import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

		for(int i = 1; i <= t; i++) {
			int n = sc.nextInt();	// 최종단계
			int k = sc.nextInt();	// 현재단계
			int s = sc.nextInt();	// 검있는 단계

			int time = 0;
			time = k - 1;

			int resetVer = 1 + n;
			int beforeVer = (k - s) + (n - s + 1);

			if(resetVer < beforeVer) {
				System.out.println("Case #" + i + ": " + (time + resetVer));
			}
			else {
				System.out.println("Case #" + i + ": " + (time + beforeVer));
			}
		}
        sc.close();
    }
}
