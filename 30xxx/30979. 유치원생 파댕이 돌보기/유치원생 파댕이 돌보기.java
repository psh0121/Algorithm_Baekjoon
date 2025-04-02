import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int careTime = sc.nextInt();
		int candyCnt = sc.nextInt();
		int possibleTime = 0;
		
		for(int i = 0; i < candyCnt; i++) {
			possibleTime += sc.nextInt();
		}
		
		System.out.println(possibleTime >= careTime ? "Padaeng_i Happy" : "Padaeng_i Cry");
	}
}

