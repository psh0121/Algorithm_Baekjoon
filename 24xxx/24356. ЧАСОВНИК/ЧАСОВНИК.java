import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int t1 = sc.nextInt();
		int m1 = sc.nextInt();
		int t2 = sc.nextInt();
		int m2 = sc.nextInt();
		
		int hour, min;
		int total = 0;
		
		if(m2 < m1) {
			min = 60 + m2 - m1;
			t2--;
			
			if(t2 < t1) {
				hour = 24 + t2 - t1;
			}
			else {
				hour = t2 - t1;
			}
		}
		else {
			min = m2 - m1;
			
			if(t2 < t1) {
				hour = 24 + t2 - t1;
			}
			else {
				hour = t2 - t1;
			}
		}
		
		total = hour * 60 + min;
		
		System.out.println(total + " " + total/30);
	}
}         