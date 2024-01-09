import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int wallet = 100 * sc.nextInt();
		int price = sc.nextInt();
		
		if(wallet >= price) System.out.println("Yes");
		else System.out.println("No");
	}
}         
