import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int calMoney = 0;
		int needMinMoney = 0;

		for(int i = 0; i < n; i++) {
			int money = sc.nextInt();

			calMoney += money;

			if(calMoney < 0) {
				needMinMoney += Math.abs(calMoney);
				calMoney = 0;
			}
		}

		System.out.println(needMinMoney);
		sc.close(); 
    }
}
