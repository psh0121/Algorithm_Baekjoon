import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int rabbit = sc.nextInt();
		int dog = 0;
		int rWalk = sc.nextInt();
		int dWalk = sc.nextInt();
		
		int result = 0;
		
		while(true) {
			if(dog >= rabbit) break;
			
			rabbit += rWalk;
			dog += dWalk;
			result++;
		}
		
		System.out.println(result);
	}
}