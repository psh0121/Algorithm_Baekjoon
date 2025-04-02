import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int chickenCnt = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;
		
		if(chickenCnt > a) result += a;
		else result += chickenCnt;
		
		if(chickenCnt > b) result += b;
		else result += chickenCnt;
		
		if(chickenCnt > c) result += c;
		else result += chickenCnt;
		
		System.out.println(result);
	}
}