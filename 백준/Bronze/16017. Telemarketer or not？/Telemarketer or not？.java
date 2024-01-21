import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		
		if(num1 != 8 && num1 != 9) System.out.println("answer");
		else {
			if(num4 != 8 && num4 != 9) System.out.println("answer");
			else {
				if(num2 != num3) System.out.println("answer");
				else System.out.println("ignore");
			}
		}
	}
}         
