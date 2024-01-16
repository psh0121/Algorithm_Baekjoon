import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		// 0: 직각 삼각형이나 정삼각형을 만들 수 없음
		// 1: 직각 삼각형만 만들 수 있음
		// 2: 정삼각형을 만들 수 있음
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) arr[i] = sc.nextInt();
		Arrays.sort(arr);
		
		if(arr[0] == arr[1] && arr[1] == arr[2] && arr[0] == arr[2]) System.out.println(2);
		else if(arr[2] * arr[2] == (arr[0] * arr[0]) + (arr[1] * arr[1])) System.out.println(1);
		else System.out.println(0);
	}
}         
