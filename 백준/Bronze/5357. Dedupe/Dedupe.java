import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str = "";
		String result = "";
		
		for(int i = 0; i < cnt; i++) {
			str = sc.next();
			result = "" + str.charAt(0);
			
			for(int j = 1; j < str.length(); j++) {
				if(str.charAt(j - 1) != str.charAt(j)) result += str.charAt(j);
			}
			
			System.out.println(result);
		}
	}
}         
