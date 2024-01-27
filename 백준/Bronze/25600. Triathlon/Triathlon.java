import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int maxNum = Integer.MIN_VALUE;
		
		for(int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int d = sc.nextInt();
			int g = sc.nextInt();
			
			int grade = a * (d + g);
			
			if(a == d + g) grade *= 2;
			
			maxNum = Math.max(maxNum, grade);
		}
		
		System.out.println(maxNum);
	}
}         