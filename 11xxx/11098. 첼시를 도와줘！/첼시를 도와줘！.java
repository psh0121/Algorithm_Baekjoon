import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int p = sc.nextInt();

			int maxMoney = Integer.MIN_VALUE;
			String maxName = "";

			for(int j = 0; j < p; j++) {
				int money = sc.nextInt();
				String name = sc.next();

				if(money > maxMoney) {
					maxMoney = money;
					maxName = name;
				}
			}

			System.out.println(maxName);
		}
		sc.close();
    }
}
