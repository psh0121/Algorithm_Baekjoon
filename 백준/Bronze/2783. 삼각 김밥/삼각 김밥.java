import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double g = sc.nextDouble();
		int price = sc.nextInt();
		double minPrice = g / price * 1000; // 1000그램당 가격
	
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			double otherG = sc.nextDouble();
			int otherPrice = sc.nextInt();
			
			minPrice = Math.min(minPrice, otherG / otherPrice * 1000);
		}
		
		System.out.println(minPrice);
	}
}

