import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("The largest square has side length " + (int)Math.sqrt(num) + ".");
	}
}         
