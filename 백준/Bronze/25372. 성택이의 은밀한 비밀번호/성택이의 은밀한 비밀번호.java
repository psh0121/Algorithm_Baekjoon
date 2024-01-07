import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String password;
		
		for(int i = 0; i < cnt; i++) {
			password = sc.next();
			
			if(password.length() >= 6 && password.length() <= 9) {
				System.out.println("yes");
			}
			else System.out.println("no");
		}
	}
}         
