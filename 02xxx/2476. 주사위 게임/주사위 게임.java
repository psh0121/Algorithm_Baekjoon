import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxMoney = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int money = 0;
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			// 모두 같은 눈 
			if(a == b && b == c && a == c) money = 10000 + a * 1000;
			
			// 같은 눈 2개 
			else if(a == b) money = 1000 + a * 100;
			else if(b == c) money = 1000 + b * 100;
			else if(c == a) money = 1000 + c * 100;
			
			// 모두 다른 눈 
			else money = Math.max(Math.max(a, b), c) * 100;
			
			maxMoney = maxMoney > money ? maxMoney : money;
		}
		
		System.out.println(maxMoney);
	}
}

