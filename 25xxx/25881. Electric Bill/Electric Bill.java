import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int rate1 = sc.nextInt();
		int rate2 = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int amount = sc.nextInt();
			
			if(amount <= 1000) System.out.println(amount + " " + (amount * rate1));
			else {
				System.out.println(amount + " " + ((1000 * rate1) + ((amount - 1000) * rate2)));
			}
		}
	}
}