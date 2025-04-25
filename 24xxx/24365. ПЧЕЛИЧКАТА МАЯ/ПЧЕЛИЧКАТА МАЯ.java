import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sameCnt = (a + b + c) / 3;
		int moveCnt = 0;
		
		moveCnt += c - sameCnt;
		b = b + (c - sameCnt);
		
		moveCnt += b - sameCnt;
		
		System.out.println(moveCnt);
	}
}         