import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i = 0; i < n; i++) {
			int cnt = sc.nextInt();
			System.out.print("Denominations: ");
			
			int[] arr = new int[cnt];
			for(int j = 0; j < cnt; j++) {
				arr[j] = sc.nextInt();
				System.out.print(arr[j] + " ");
			}
			sc.nextLine();
			System.out.println();
			
			Arrays.sort(arr);
			
			boolean goodFlag = true;
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] * 2 > arr[j+1]) {
					goodFlag = false;
					break;
				}
			}
			
			if(goodFlag) System.out.println("Good coin denominations!");
			else System.out.println("Bad coin denominations!");
			
			System.out.println();
		}
	}
}