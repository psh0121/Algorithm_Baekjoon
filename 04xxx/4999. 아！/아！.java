import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String me = sc.next();
		String doctor = sc.next();
		
		if(me.length() < doctor.length()) System.out.println("no");
		else System.out.println("go");
	}

}