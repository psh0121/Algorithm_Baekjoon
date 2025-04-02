import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt() * 60 + sc.nextInt() + sc.nextInt();
		
		int rh = (time / 60) % 24;
		int rm = time % 60;
		
		System.out.println(rh + " " + rm);
	}
}

