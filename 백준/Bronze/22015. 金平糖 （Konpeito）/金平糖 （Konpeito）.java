import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maxNum = Math.max(a, Math.max(b, c));
		
		System.out.println((maxNum - a) + (maxNum - b) + (maxNum - c));
	}
}         