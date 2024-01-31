import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		String result = "YES";
		
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[2]);
		int c = Integer.parseInt(arr[4]);
		
		if((a+b) != c) result = "NO";
		
		System.out.println(result);
	}
}