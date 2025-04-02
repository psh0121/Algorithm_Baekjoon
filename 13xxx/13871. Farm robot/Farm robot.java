import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 충전소 수
		int c = sc.nextInt();	// 명령 수
		int s = sc.nextInt();	// 파괴된 영역에서 가장 가까운 충전소 수

		int cnt = 0;
		int cur = 1;	// 현재 위치

		for(int i = 0; i < c; i++) {
			if(cur == s) cnt++;

			int value = sc.nextInt();
			cur += value;

			if(cur == 0) cur = n;
			else if(cur > n) cur = 1;
		}

		if(cur == s) cnt++;

		System.out.println(cnt);
		sc.close();
    }
}
