import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt();
		int[] arr = new int[n];
		int sumProblem = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sumProblem += arr[i];
		}
		
		int per1 = money / sumProblem;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] * per1);
		}
	}
}