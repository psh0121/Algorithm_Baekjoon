import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		long s = sc.nextLong();
		long a = sc.nextLong();
		
		System.out.println(Math.min(s / 2, a / 2));
	}
}         