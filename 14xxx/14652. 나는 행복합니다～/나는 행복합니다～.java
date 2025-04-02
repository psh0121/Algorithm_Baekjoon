import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int ticket = sc.nextInt();
		
		System.out.println((ticket / m) + " " + (ticket % m));
		
		sc.close();
	}
}         
