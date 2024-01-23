import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		String result = "";
		
		// 뉴비 
		if(m <= 2) result = "NEWBIE!";
		
		// 올드비 
		else if(m <= n && m > 2) result = "OLDBIE!";
		
		// TLE 
		else result = "TLE!";
		
		System.out.println(result);
	}
}         