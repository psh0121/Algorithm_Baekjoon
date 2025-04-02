import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int socks = sc.nextInt();
		int result = Integer.MAX_VALUE;
		
		int day1 = sc.nextInt();
		int day2;
		
		for(int i = 0; i < days - 1; i++) {
			day2 = sc.nextInt();
			
			int totalPirce = day1*socks + day2*socks;
			
			result = result > totalPirce ? totalPirce : result;
			
			day1 = day2;
		}
		
		System.out.println(result);
	}
}