import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		String[][] origin = new String[r][c];
		String[][] wrong = new String[r][c];
		
		// origin, wrong fill value
		for(int i = 0; i < r; i++) origin[i] = sc.next().split("");
		for(int i = 0; i < r; i++) wrong[i] = sc.next().split("");
		
		int result = 0;
		
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				if(origin[i][j].equals(wrong[i][j])) result++;
			}
		}
		
		System.out.println(result);
	}
}         