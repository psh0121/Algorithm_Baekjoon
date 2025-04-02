import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			
			if(num1 == 0 && num2 == 0) break;
			else if(num1 > num2) System.out.println("Yes");
			else if(num1 <= num2) System.out.println("No");
		}
	}

}