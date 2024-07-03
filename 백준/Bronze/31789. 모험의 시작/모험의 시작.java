import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();	// 돈
		int s = sc.nextInt();	// 후안의 공격력

		for(int i = 0; i < n; i++) {
			int c = sc.nextInt();	// 무기가격
			int p = sc.nextInt();	// 공격력

			if(c <= x && p > s) {
				System.out.println("YES");
				return;
			}
		}

		System.out.println("NO");
		sc.close();
    }
}