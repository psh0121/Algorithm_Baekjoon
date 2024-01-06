import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = 20000303;
		String N = sc.next();
		
		String val = "";
		
		for(int i = 0; i < N.length(); i++) {
			val += N.charAt(i);
			
			val = "" + (Integer.parseInt(val) % num);
		}
		
		System.out.println(val);
	}
}         