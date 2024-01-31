import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = 10;
		String[] direction = {"E", "S", "W", "N"};
		int idx = 3;	// 북쪽시작 
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			if(value == 1) {
				idx = (Math.abs(idx + 1)) % 4;
			}
			else if(value == 2) {
				idx = (Math.abs(idx + 2)) % 4;
			}
			else {
				if(idx - 1 < 0) idx = 3;
				else idx = (Math.abs(idx - 1)) % 4;
			}
		}
		
		System.out.println(direction[idx]);
	}
}