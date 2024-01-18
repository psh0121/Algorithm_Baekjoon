import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		int[] plan = new int[day];
		int[] start = new int[day];
		
		int cnt = 0;
		
		for(int i = 0; i < day; i++) plan[i] = sc.nextInt();
		for(int i = 0; i < day; i++) start[i] = sc.nextInt();
		
		for(int i = 0; i < day; i++) {
			if(plan[i] <= start[i]) cnt++;
		}
		
		System.out.println(cnt);
		
		sc.close();
	}
}         
