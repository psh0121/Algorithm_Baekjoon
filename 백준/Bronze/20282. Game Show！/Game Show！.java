import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		int money = 100;

		int maxMoney = 100;

		for(int i = 0; i < n; i++) {
			int pwd = sc.nextInt();
			money += pwd;

			maxMoney = Math.max(maxMoney, money);
		}

		System.out.println(maxMoney);
        sc.close();
    }
}
