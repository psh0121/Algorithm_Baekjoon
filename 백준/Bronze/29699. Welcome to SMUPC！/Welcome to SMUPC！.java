import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = "WelcomeToSMUPC";
		
		int index = num % 14;
		
		if(index == 0) index = 14;
		
		System.out.println(str.charAt(index -1));
	}
}         
