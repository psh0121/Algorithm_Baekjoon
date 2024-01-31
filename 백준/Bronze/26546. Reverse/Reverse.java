import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			for(int j = 0; j < str.length(); j++) {
				if(j >= a && j < b) continue;
				else System.out.print(str.charAt(j));
			}
			
			System.out.println();
		}
	}
}