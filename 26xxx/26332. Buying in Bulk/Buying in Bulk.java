import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int cnt = sc.nextInt();
			int price = sc.nextInt();
			System.out.println(cnt + " " + price);
			System.out.println(price + ((cnt-1) * (price-2)));
		}
	}
}         