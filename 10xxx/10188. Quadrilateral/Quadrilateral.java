import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int col, row;
		
		for(int i = 0; i < cnt; i++) {
			col = sc.nextInt();
			row = sc.nextInt();
			
			for(int j = 0; j < row; j++) {
				System.out.println("X".repeat(col));
			}
			
			System.out.println("");
		}
	}
}         
