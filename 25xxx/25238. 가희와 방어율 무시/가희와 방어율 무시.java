import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		double monster = sc.nextDouble();
		int user = sc.nextInt();
		
		double num = monster - (monster * user / 100);
		
		if(num >= 100) System.out.println(0);
		else System.out.println(1);
	}
}         