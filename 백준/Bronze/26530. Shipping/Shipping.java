import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int cnt = sc.nextInt();
			double total = 0;
			
			for(int j = 0; j < cnt; j++) {
				sc.next();	// 품목이름 날리기 
				total += sc.nextDouble() * sc.nextDouble();
			}
			
			System.out.println("$" + String.format("%.2f", total));
		}
	}
}