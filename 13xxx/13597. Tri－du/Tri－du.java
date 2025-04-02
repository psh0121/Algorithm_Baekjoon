import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int card1 = sc.nextInt();
		int card2 = sc.nextInt();
		
		if(card1 == card2) System.out.println(card1);
		else System.out.println(Math.max(card1, card2));
		
		sc.close();
	}
}         
