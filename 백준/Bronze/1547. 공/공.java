import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int ball = 1;
		
		for(int i = 0; i < n; i++) {
			int cup1 = sc.nextInt();
			int cup2 = sc.nextInt();
			
			if(ball == cup1) ball = cup2;
			else if(ball == cup2) ball = cup1;
		}
		
		System.out.println(ball);
	}
}