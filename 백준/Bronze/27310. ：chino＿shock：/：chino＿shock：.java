import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int len = str.length();
		int colon = 0;
		int underbar = 0;
		
		for(int i = 0; i < len; i++) {
			if(str.charAt(i) == ':') colon++;
			else if(str.charAt(i) == '_') underbar++;
		}
		
		System.out.println(len + colon + underbar * 5);
	}
}