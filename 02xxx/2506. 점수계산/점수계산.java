import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int grade = 0;
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			
			if(value == 1) {
				grade++;
				result += grade;
			}
			else grade = 0;
		}
		
		System.out.println(result);
	}
}

