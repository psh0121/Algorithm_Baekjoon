import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int generalTax = (int) (money * 0.78);
		int specialTax = (int) (money - ((money * 0.2) * 0.22));
		
		System.out.println(generalTax + " " + specialTax);
	}
}         
