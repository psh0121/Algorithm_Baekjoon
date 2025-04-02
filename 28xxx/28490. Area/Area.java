import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxNum = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			maxNum = Math.max(maxNum, sc.nextInt() * sc.nextInt());
		}
		
		System.out.println(maxNum);
	}
}         