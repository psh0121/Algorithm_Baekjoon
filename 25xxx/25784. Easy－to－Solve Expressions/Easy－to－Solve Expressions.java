import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		Arrays.sort(arr);
		
		if(arr[0] + arr[1] == arr[2]) System.out.println(1);
		else if(arr[0] * arr[1] == arr[2]) System.out.println(2);
		else System.out.println(3);
	}
}         