import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String name = "";
		int money = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++) {
			int curMoney = sc.nextInt();
			String curName = sc.next();
			String curNation = sc.next();

			if(!curNation.equals("Russia")) continue;

			if(curMoney > money) {
				name = curName;
				money = curMoney;
			}
		}

		System.out.println(name);
		sc.close();
    }
}
