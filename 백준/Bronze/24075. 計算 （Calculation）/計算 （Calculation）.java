import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int minus = a - b;
		
		System.out.println(Math.max(sum, minus) + " " + Math.min(sum, minus));
	}
}         