import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		
		// 짝수보단 홀수가 더 맛있음
		// 같은 수일경우엔 맛이 더 큰 칵테일이 맛있음
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr);

		int oddCnt = 0;
		for(int i = 0; i < 3; i++) if(arr[i] % 2 == 1) oddCnt++;

		int result = 0;

		if(oddCnt == 3 || oddCnt == 0) {
			result = arr[0] * arr[1] * arr[2];
		}
		else if(oddCnt == 2) {
			int[] oddArr = new int[2];
			int oddIdx = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 1) {
					oddArr[oddIdx++] = arr[i];
				}
			}

			result = oddArr[0] * oddArr[1];
		}
		else if (oddCnt == 1) {
			if(arr[0] % 2 == 1) {
				result = arr[0];
			}
			else if(arr[1] % 2 == 1) {
				result = arr[1];
			}
			else {
				result = arr[2];
			}
		}
		
		System.out.println(result);

		sc.close();
    }
}
