import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			// 자건거 값만큼 돈을 가지고 있는가?
			if(a + (b * 2) < c) {
				System.out.println("NO");
				continue;
			}

			int money = c;

			// 2루블 먼저내기 
			if(money / 2 > b) money -= 2 * b;
			else money -= 2 * (money / 2);

			// 1루블로 차액내기 
			if(money > a) System.out.println("NO");
			else System.out.println("YES");
		}
        sc.close();
    }
}
