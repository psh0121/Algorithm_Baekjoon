import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str;
		
		for(int i = 0; i < cnt; i++) {
			str = sc.next();
			System.out.println("" + str.charAt(0) + str.charAt(str.length()-1));
		}
	}

}