import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int depth = sc.nextInt();
		int afterSec = sc.nextInt();
		
		for(int i = 0; i < afterSec; i++) {
			if(depth % 2 == 0) {
				depth = (depth / 2) ^ 6;
			}
			else {
				depth = (2 * depth) ^ 6;
			}
		}
		
		System.out.println(depth);
	}
}