import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		int cornYard = 4840 * 5;

		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int result = (int)(Math.ceil((w * h) / (double)cornYard));
		
		System.out.println(result);
	}
}