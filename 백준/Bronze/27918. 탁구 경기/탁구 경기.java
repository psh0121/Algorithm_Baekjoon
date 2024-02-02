import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = 0;
		int p = 0;
		
		for(int i = 0; i < n; i++) {
			String win = sc.next();
			
			if(win.equals("D")) d++;
			else p++;
			
			if(Math.abs(d - p) == 2) break;
		}
		
		System.out.println(d + ":" + p);
	}
}