import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int today = sc.nextInt();
		int lastLast = sc.nextInt();
		
		int days = 14 - today;
		int result = 0;
		
		if(today - 7 > 0) result = today - 7;
		else {
			if(lastLast == (30 - days)) {	// 30
				result = 30 - Math.abs(today - 7);
			}
			else if(lastLast == (30 - days) - 2) {	// 28
				result = 28 - Math.abs(today - 7);
			}
			else if(lastLast == (30 - days) - 1) {	// 29
				result = 29 - Math.abs(today - 7);
			}
			else if(lastLast == (30 - days) + 1) {	// 31
				result = 31 - Math.abs(today - 7);
			}
			else {
				result = days;
			}
		}
		
		System.out.println(result);
	}
}