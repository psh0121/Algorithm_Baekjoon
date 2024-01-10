import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		String fiveCheck = "++++ ";
		String oneCheck = "|";
		
		int num;
		String result = "";
		
		for(int i = 0; i < cnt; i++) {
			num = sc.nextInt();
			result = "";
			
			result += fiveCheck.repeat(num / 5);
			result += oneCheck.repeat(num % 5);
			
			System.out.println(result);
		}
	}
}         
