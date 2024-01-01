import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int floor;
		int sum = 0;
		
		while(true) {
			floor = sc.nextInt();
			if(floor == 0) break;
			
			for(int i = 1; i <= floor; i++) {
				sum += i;
			}
			
			System.out.println(sum);
			sum = 0;
		}
	}

}