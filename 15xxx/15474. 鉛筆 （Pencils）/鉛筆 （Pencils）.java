import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		
		int price1 = (int) (Math.ceil(cnt / a) * b);
		int price2 = (int) (Math.ceil(cnt / c) * d);
		
		System.out.println(Math.min(price1, price2));
	}
}         
