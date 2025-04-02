import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
			System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
			Arrays.sort(arr);
			
			if(arr[2] < 10) {
				System.out.println("zilch");
				System.out.println();
			}
			else if(arr[1] < 10 && arr[2] >= 10) {
				System.out.println("double");
				System.out.println();
			}
			else if(arr[0] < 10 && arr[1] >= 10 && arr[2] >= 10) {
				System.out.println("double-double");
				System.out.println();
			}
			else {
				System.out.println("triple-double");
				System.out.println();
			}
		}
	}
}