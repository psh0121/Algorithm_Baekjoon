import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String getValue = sc.next();
		
		String alphabet = "";
		
		for(int i = 0; i < alpha.length(); i++) {
			alphabet = Character.toString(alpha.charAt(i));
			
			if(!getValue.contains(alphabet)) break;
		}
		
		System.out.println(alphabet);
	}
}