import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		String[] heart = {
				" @@@   @@@  ",
				"@   @ @   @ ",
				"@    @    @ ",
				"@         @ ",
				" @       @  ",
				"  @     @   ",
				"   @   @    ",
				"    @ @     ",
				"     @      "
		};

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int i = 0; i < heart.length; i++) {
			for(int j = 0; j < cnt; j++) {
				System.out.print(heart[i]);
			}
			System.out.println();
		}
	}
}