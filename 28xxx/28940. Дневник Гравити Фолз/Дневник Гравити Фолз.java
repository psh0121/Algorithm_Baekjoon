import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int wLetter = w / a;
		int hLetter = h / b;
		
		if(w < a || h < b) System.out.println(-1);
		else {
			System.out.println((int)Math.ceil((double)n / (wLetter * hLetter)));
		}
	}
}         