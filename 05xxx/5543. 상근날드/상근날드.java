import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cheapBurger = Math.min(sc.nextInt(), sc.nextInt());
		cheapBurger = Math.min(cheapBurger, sc.nextInt());
		
		int cheapDrink = Math.min(sc.nextInt(), sc.nextInt());
		
		System.out.println(cheapBurger + cheapDrink - 50);
	}
}         
