import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		int result = 0;
		
		for(int i = s; i <= e; i++) {
			if(Math.abs(k - i) <= x) result++;
		}
		
		if(result == 0) System.out.println("IMPOSSIBLE");
		else System.out.println(result);
	}
}         