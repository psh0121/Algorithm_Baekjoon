import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = Integer.MAX_VALUE;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();	// 개당 만드는 재료양
			int b = sc.nextInt();	// 현재 가지고 있는 재료양

			cnt = Math.min(cnt, b / a);
		}

		System.out.println(cnt);
		sc.close();
    }
}