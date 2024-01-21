import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double p1 = sc.nextDouble();
		double r = sc.nextDouble();
		double p2 = sc.nextDouble();
		
		double x = a / p1;
		double y = Math.PI * r * r / p2;
		
		if(x < y) System.out.println("Whole pizza");
		else System.out.println("Slice of pizza");
	}
}         