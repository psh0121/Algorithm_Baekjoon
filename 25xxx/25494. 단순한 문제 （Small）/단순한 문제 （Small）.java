import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int max = Math.min(Math.min(sc.nextInt(), sc.nextInt()), sc.nextInt());
			System.out.println(max);
		}
	}
}         