import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		int[] arr = new int[strArr.length];
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(strArr[i]);
		
		Arrays.sort(arr);
		
		int result = 1 + arr[1] + arr[2] + arr[3];
		
		System.out.println(result);
	}
}