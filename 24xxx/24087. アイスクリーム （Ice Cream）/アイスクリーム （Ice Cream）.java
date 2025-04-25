import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int money = 250;
		int cm = a;
		
		while(true) {
			if(cm >= s) break;
			
			cm += b;
			money += 100;
		}
		
		System.out.println(money);
	}
}         