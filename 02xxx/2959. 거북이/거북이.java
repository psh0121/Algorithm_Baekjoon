import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		int[] arr = new int[strArr.length];
		for(int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(strArr[i]);
		
		Arrays.sort(arr);
		
		System.out.println(Math.min(arr[0], arr[1]) * Math.min(arr[2], arr[3]));
	}
}

