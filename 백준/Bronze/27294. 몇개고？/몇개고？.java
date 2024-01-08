import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int s = sc.nextInt();
		
		if(t <= 11) {
			System.out.println(280);
		}
		else if(t >= 12 && t <= 16) {
			if(s == 1) System.out.println(280);
			else System.out.println(320);
		}
		else {
			System.out.println(280);
		}
	}
}         
