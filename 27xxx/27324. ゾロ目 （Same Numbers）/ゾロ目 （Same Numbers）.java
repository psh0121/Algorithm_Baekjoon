import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		String digit1 = Character.toString(num.charAt(0));
		String digit10 = Character.toString(num.charAt(1));
		
		if(digit1.equals(digit10)) System.out.println(1);
		else System.out.println(0);
	}
}         