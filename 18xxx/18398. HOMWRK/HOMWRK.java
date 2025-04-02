import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		
		int a, b;
		
		for(int i = 0; i < t; i++) {
			n = sc.nextInt();
			for(int j = 0; j < n; j++) {
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println((a + b) + " " + (a * b));
			}
		}
	}
}         