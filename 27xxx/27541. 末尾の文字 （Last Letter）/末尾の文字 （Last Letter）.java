import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		
		if(str.charAt(str.length() - 1) == 'G') {
			System.out.println(str.substring(0, str.length() - 1));
		}
		else System.out.println(str + "G");
	}
}