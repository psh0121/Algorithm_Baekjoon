import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		String  grade = sc.next();
		
		switch(grade) {
		case "miss":
			System.out.println(0);
			break;
		case "bad":
			System.out.println(200 * key);
			break;
		case "cool":
			System.out.println(400 * key);
			break;
		case "great":
			System.out.println(600 * key);
			break;
		default:
			System.out.println(1000 * key);
			break;
		}
	}
}         
