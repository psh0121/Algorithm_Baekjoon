import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		double l = 3.785411784;
		double m = 1609.344;
		
		Scanner sc = new Scanner(System.in);
		double mile = sc.nextDouble();
		
		System.out.println(l / (m * mile) * 100000);
		
		sc.close();
	}
}         
