import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		for(int i = 0; i < r; i++) {
			System.out.println("*".repeat(c));
		}
		
		sc.close();
	}
}         
