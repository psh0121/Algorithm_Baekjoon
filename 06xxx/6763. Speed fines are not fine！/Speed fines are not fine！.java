import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		int overSpeed = sc.nextInt();
		
		int val = overSpeed - speed;
		
		if(overSpeed <= speed) System.out.println("Congratulations, you are within the speed limit!");
		else {
			if(val >= 31) System.out.println("You are speeding and your fine is $500.");
			else if(val >= 21 && val <= 30) System.out.println("You are speeding and your fine is $270.");
			else System.out.println("You are speeding and your fine is $100.");
		}
	}
}         
