import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int birthYear = sc.nextInt();
		int birthMonth = sc.nextInt();
		int birthDay = sc.nextInt();
		
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		// 만나이
		int age1 = year - birthYear;
		if(birthMonth * 100 + birthDay > month * 100 + day) age1--;
		
		System.out.println(age1);
		
		// 세는나이
		System.out.println(year - birthYear + 1);
		
		// 연나이 
		System.out.println(year - birthYear);
	}
}         
