import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		double d, f, p;
		String result;
		
		for(int i = 0; i < cnt; i++) {
			d = sc.nextDouble();
			f = sc.nextDouble();
			p = sc.nextDouble();
			
			result = String.format("%.2f", (f * p) * d);
			System.out.println("$" + result);
		}
	}
}         
