import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int c = sc.nextInt();
		
		if(p > c) {
			System.out.println(c + c + 1);
		}
		else if(p == c) {
			System.out.println(c + c - 1);
		}
		else {
			System.out.println((p - 1) + (p - 1) + 1);
		}
		
		sc.close();
	}
}         
