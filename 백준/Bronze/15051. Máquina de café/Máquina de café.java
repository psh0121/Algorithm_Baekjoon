import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int result = 0;
		
		// 1층에 커피머신일경우
		result = (arr[1] * 2) + (arr[2] * 2 * 2);
		
		// 2층에 커피머신일경우 
		result = Math.min(result, (arr[0] * 2) + (arr[2] * 2));
		
		// 3층에 커피머신일경우 
		result = Math.min(result, (arr[0] * 2 * 2) + (arr[1] * 2));
		
		System.out.println(result);
		
		sc.close();
	}
}         
