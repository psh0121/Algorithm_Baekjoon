import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int a, b, x;
		
		for(int i = 0; i < cnt; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			x = sc.nextInt();
			
			System.out.println(a * (x - 1) + b);
		}
	}
}         
