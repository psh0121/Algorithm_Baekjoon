import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			if(!Character.toString(str.charAt(str.length() - 1)).equals(".")) {
				str += ".";
			}
			
			System.out.println(str);
		}
	}
}