import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int perfectTeam = 0;

		for(int i = 0; i < n; i++) {
			int p1 = sc.nextInt();
			int p2 = sc.nextInt();
			int p3 = sc.nextInt();

			// p1이 p2, p3보다 크다
			// 이때 다음 문제가 문제푸는 소요시간이 크다
			// 못풀어도 괜춘하다
			
			// 1번을 못풀거나 하나도 못풀면 NO PERFECT
			if(p1 == -1) continue;

			// 1번해결
			if(p1 >= 0) {
				// 1번만 해결
				if(p2 == -1 && p3 == -1) perfectTeam++;
				// 2번해결 3번 미해결
				else if(p2 >= p1 && p3 == -1) perfectTeam++;
				// 2번해결 3번 해결
				else if(p2 >= p1 && p3 >= p2) perfectTeam++;
				// 규칙에 어긋나게 해결
				else {}
			}
			else {}
		}

		System.out.println(perfectTeam);
		sc.close();
    }
}