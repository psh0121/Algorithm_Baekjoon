import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		
		System.out.println((int)(num * (num - 1)));
	}
}         
