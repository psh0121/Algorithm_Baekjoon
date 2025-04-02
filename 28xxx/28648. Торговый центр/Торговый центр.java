import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int minNum = Integer.MAX_VALUE;
		
		for(int i = 0; i < cnt; i++) {
			minNum = Math.min(minNum, sc.nextInt() + sc.nextInt());
		}
		
		System.out.println(minNum);
	}
}         