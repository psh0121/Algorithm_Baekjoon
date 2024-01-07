import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int general = sc.nextInt();
		int mini = sc.nextInt();
		
		System.out.println(general * 8 + mini * 3 - 28);
	}
}         
