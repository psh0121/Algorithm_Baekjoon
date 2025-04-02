import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String str;
		
		int result = 0;
		
		for(int i = 0; i < cnt; i++) {
			str = sc.next();
			
			if(str.contains("01") || str.contains("OI")) result++;
		}
		
		System.out.println(result);
	}
}         
