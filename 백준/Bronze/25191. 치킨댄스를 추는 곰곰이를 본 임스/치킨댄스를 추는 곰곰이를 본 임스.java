import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int chicken = sc.nextInt();
		int coke = sc.nextInt();
		int beer = sc.nextInt();
		
		int eat = 0;
		
		eat += (coke / 2);
		eat += beer;
		
		System.out.println(Math.min(chicken, eat));
	}
}         