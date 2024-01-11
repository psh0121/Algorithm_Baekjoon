import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		int cookingSec = sc.nextInt();
		
		s += cookingSec;
		
		// 초계산
		m += s / 60;
		s = s % 60;
		
		// 분계산  
		h += m / 60;
		m = m % 60; 
		
		// 시계산
		h = h % 24;
		
		System.out.println(h + " " + m + " " + s);
	}
}         
