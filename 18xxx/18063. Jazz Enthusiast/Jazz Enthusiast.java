import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = sc.nextInt();

		// mm과 ss를 더해서 저장한다.
		int mm = 0;
		int ss = 0;

		for(int i = 0; i < n; i++) {
			String[] time = sc.next().split(":");

			int m = Integer.parseInt(time[0]);
			int s = Integer.parseInt(time[1]);

			mm += m;
			ss += s;
		}

		// 전체초
		int totalSec = mm * 60 + ss;
		totalSec -= c * (n - 1);

		int remainSec = totalSec;

		// 시분초
		int hh = remainSec / 3600;
		remainSec %= 3600;

		mm = remainSec / 60;
		ss = remainSec % 60;

		System.out.printf("%02d:%02d:%02d", hh, mm, ss);

		sc.close(); 
    }
}
