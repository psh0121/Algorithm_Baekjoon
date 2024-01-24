import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		double r = Math.sqrt(s / Math.PI);
		
		System.out.println(2 * s / r);
	}
}         