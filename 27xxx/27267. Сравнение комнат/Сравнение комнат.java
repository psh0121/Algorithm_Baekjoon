import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt() * sc.nextInt();
		int p = sc.nextInt() * sc.nextInt();
		
		if(m > p) System.out.println("M");
		else if(m == p) System.out.println("E");
		else System.out.println("P");
	}
}