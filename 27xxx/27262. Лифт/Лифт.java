import java.util.Scanner;

public class Main {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ele = (k - 1) * b + (n - 1) * b;
		int stairs = (n - 1) * a;
		
		System.out.println(ele + " " + stairs);
	}
}