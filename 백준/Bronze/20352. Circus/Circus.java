import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double s = sc.nextDouble();
		double r = Math.sqrt(s / Math.PI);
		
		System.out.println(2 * s / r);
	}
}         