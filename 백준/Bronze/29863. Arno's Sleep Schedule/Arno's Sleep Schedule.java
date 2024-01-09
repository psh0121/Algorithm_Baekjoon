import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sleepTime = sc.nextInt();
		int wakeTime = sc.nextInt();
		
		int hour = sleepTime;
		int result = 0;
		
		while(hour != wakeTime) {
			result++;
			hour++;
			
			if(hour == 24) hour = 0;
		}
		
		System.out.println(result);
	}
}         
