import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		double w = sc.nextDouble();
		double h = sc.nextDouble();
		
		double result = w + h;
		
		result -= Math.sqrt(Math.pow(w, 2) + Math.pow(h, 2));
		
		System.out.println(result);
	}
}         