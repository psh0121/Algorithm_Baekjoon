import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int zeroCnt = 0;
		if(a == 0) zeroCnt++;
		if(b == 0) zeroCnt++;
		if(c == 0) zeroCnt++;
		
		if(a == b && b == c && a == c) System.out.println("*");
		else {
			if(zeroCnt == 1) {
				if(a == 0) System.out.println("A");
				else if(b == 0) System.out.println("B");
				else System.out.println("C");
			}
			else {
				if(a == 1) System.out.println("A");
				else if(b == 1) System.out.println("B");
				else System.out.println("C");
			}
		}
		
		sc.close();
	}
}         
