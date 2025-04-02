import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		int[] location = {sc.nextInt(), sc.nextInt()};
		
		for(int i = 0; i < cnt-1; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if(y < location[1]) {
				location[0] = x;
				location[1] = y;
			}
		}
		
		System.out.println(location[0] + " " + location[1]);
	}
}         
