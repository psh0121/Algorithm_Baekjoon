import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int find = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				find++;
				
				if(m == find) {
					System.out.println(i);
					return;
				}
			}
		}
		
		System.out.println(0);
	}
}

