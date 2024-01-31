import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int c = sc.nextInt();
		
		int total = 0;
		
		total += (p * 50);
		total -= (c * 10);
		
		if(p > c) total += 500;
		
		System.out.println(total);
	}
}