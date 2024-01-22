import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int grade;
		
		for(int i = 0; i < cnt; i++) {
			grade = sc.nextInt();
			
			if(grade <= 25) System.out.println("Case #" + (i+1) + ": World Finals");
			else if(grade <= 1000) System.out.println("Case #" + (i+1) + ": Round 3");
			else if(grade <= 4500) System.out.println("Case #" + (i+1) + ": Round 2");
			else System.out.println("Case #" + (i+1) + ": Round 1");
		}
	}
}         