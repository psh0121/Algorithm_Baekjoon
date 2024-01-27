import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = -1;
		
		for(int i = 0; i < n; i++) {
			int walkTime = sc.nextInt();
			int breadTime = sc.nextInt();
			
			if(walkTime > breadTime) continue;
			
			if(i == 0) result = breadTime;
			else result = Math.min(result, breadTime);
		}
		
		System.out.println(result);
	}
}         