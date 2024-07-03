import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 윤이
		int cu = sc.nextInt();
		int du = sc.nextInt();
		// 달구
		int cd = sc.nextInt();
		int dd = sc.nextInt();
		// 포닉스
		int cp = sc.nextInt();
		int dp = sc.nextInt();

		int h = sc.nextInt();

		int sec = 0;	// 현재 발생시간 

		while (h > 0) {
			if(sec % cu == 0) h -= du;
			if(sec % cd == 0) h -= dd;
			if(sec % cp == 0) h -= dp;

			sec++;
		}

		System.out.println(sec - 1);
		
		sc.close();
    }
}