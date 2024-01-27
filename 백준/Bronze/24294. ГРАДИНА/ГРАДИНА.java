import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int w1 = sc.nextInt();
		int h1 = sc.nextInt();
		int w2 = sc.nextInt();
		int h2 = sc.nextInt();
		
		System.out.println(4 + 2*Math.max(w1, w2) + 2*(h1 + h2));
	}
}         