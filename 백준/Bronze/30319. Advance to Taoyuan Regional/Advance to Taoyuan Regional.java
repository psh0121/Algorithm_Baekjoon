import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.next().split("-");
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) arr[i] = Integer.parseInt(strArr[i]);
		
		Calendar start = Calendar.getInstance();
		start.set(2023, 10, 21);
		
		Calendar contest = Calendar.getInstance();
		contest.set(arr[0], arr[1], arr[2]);
		
		double dDay = start.getTimeInMillis() - contest.getTimeInMillis();
		dDay = dDay / 1000 / 60 / 60 / 24;
		
		if(dDay >= 35) System.out.println("GOOD");
		else System.out.println("TOO LATE");
	}
}         
