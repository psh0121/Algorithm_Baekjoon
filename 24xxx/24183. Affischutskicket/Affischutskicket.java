import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		double c4 = 0.229 * 0.324 * 2;
		double a3 = 0.297 * 0.420 * 2;
		double a4 = 0.210 * 0.297;
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(c4*a + a3*b + a4*c);
	}
}         