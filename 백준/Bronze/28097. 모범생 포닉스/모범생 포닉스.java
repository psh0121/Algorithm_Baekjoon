import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			sum += sc.nextInt();
			sum += 8;
		}
		
		sum -= 8;
		
		System.out.println((sum / 24) + " " + (sum % 24));
	}
}