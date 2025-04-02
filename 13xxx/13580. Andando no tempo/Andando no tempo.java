import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
		int bigNum;
		int sum;
		
		// 같은수가 2개면 S
		if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) System.out.println("S");
		else {
			// 총합계에서 가장 큰수를 두번 빼서 0이되면 S
			bigNum = Math.max(arr[0], arr[1]);
			bigNum = Math.max(bigNum, arr[2]);
			
			sum = arr[0] + arr[1] + arr[2];
			
			if(sum - bigNum - bigNum == 0) System.out.println("S");
			else System.out.println("N");
		}
		
		sc.close();
	}
}         
