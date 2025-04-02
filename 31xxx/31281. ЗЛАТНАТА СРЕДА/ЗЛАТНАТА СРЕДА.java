import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] strArr = sc.nextLine().split(" ");
		BigInteger[] arr = new BigInteger[strArr.length];
		for(int i = 0; i < arr.length; i++) arr[i] = new BigInteger(strArr[i]);
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
	}
}