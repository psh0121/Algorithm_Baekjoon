import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		for(int i = 0; i < 3; i++) {
			int person = sc.nextInt();
			int cnt = 0;
			
			if(person % (a+b) > 0 && person % (a+b) <= a) cnt++;
			if(person % (c+d) > 0 && person % (c+d) <= c) cnt++;
			
			System.out.println(cnt);
		}
	}
}

