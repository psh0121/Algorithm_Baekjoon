import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if(n == 0 && m == 0) break;

			int payMoney = m / n;
			int totalMoney = 0;

			for(int i = 0; i < n; i++) {
				int money = sc.nextInt();

				if(money < payMoney) totalMoney += money;
				else totalMoney += payMoney;
			}

			System.out.println(totalMoney);
		}
		sc.close();
    }
}