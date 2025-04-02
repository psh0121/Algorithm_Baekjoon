import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int walkToSubway = sc.nextInt();
		int bus = sc.nextInt();
		int timeLeftSubway = sc.nextInt();
		
		int subway = walkToSubway + (timeLeftSubway - walkToSubway);
		
		if(bus < subway) System.out.println("Bus");
		else if(bus == subway) System.out.println("Anything");
		else System.out.println("Subway");
	}
}         
