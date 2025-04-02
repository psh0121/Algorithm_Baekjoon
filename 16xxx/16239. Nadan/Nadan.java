import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int cnt = sc.nextInt();

		for(int i = 1; i <= cnt; i++) {
			if(i == cnt) System.out.println(money);
			else {
				System.out.println(i);
				money -= i;
			}
		}
		
		sc.close();
    }
}