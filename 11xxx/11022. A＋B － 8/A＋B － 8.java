import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int A, B;
		
		for(int i = 0; i < cnt; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println("Case #" + (i + 1) + ": " + A + " + " + B + " = " + (A+B));
		}
	}
}         