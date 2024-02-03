import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int maxNum = Math.max(num1, num2);
		int minNum = Math.min(num1, num2);
		
		int cal = (minNum % 4) - (maxNum % 4);
		if(minNum % 4 == 0) cal = 4 - (maxNum % 4);
		else if(maxNum % 4 == 0) cal = (minNum % 4) - 4;
		else if(minNum % 4 == 0 && maxNum % 4 == 0) cal = 0;
		
		// 세로 
		int h = Math.abs(cal);
		
		// 가로 
		int w = ((maxNum + cal) - minNum) / 4;
		
		System.out.println(h + w);
	}
}