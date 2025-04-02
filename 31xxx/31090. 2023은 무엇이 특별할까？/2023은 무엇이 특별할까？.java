import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String strYear;
		
		int year, yearDigit2;
		
		for(int i = 0; i < cnt; i++) {
			strYear = sc.next();
			year = Integer.parseInt(strYear);
			yearDigit2 = Integer.parseInt("" + strYear.charAt(2) + strYear.charAt(3));
			
			if((year + 1) % yearDigit2 == 0) System.out.println("Good");
			else System.out.println("Bye");
		}
	}
}         
