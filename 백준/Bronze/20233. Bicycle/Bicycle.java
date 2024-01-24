import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int x = sc.nextInt();
		int b = sc.nextInt();
		int y = sc.nextInt();
		int t = sc.nextInt();
		
		// 지불금액 - 월정액금액 + ((초과시간 * 분당요금) * 21일) 
		int aPay = a;
		int bPay = b;
		
		if(t - 30 > 0) aPay += (((t-30) * x) * 21);
		if(t - 45 > 0) bPay += (((t-45) * y) * 21);
		
		System.out.println(aPay + " " + bPay);
	}
}         