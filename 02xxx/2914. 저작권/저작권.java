import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int song = sc.nextInt();
		int avg = sc.nextInt() - 1;
		
		System.out.println(song * avg + 1);
	}
}

