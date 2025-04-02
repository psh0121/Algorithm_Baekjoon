import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fO = sc.nextInt();
		int bO = sc.nextInt();
		
		int fX = n - fO;
		int bX = n - bO;
		
		System.out.println(Math.min(fO, bO) + Math.min(fX, bX));
	}
}         