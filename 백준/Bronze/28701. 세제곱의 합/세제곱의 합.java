import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = 0;
		
		for(int i = 1; i <= num; i++) {
			result += i;
		}
		
		System.out.println(result);
		System.out.println((int)Math.pow(result, 2));
		
		result = 0;
		
		for(int i = 1; i <= num; i++) {
			result += Math.pow(i, 3);
		}
		
		System.out.println(result);
	}
}         
