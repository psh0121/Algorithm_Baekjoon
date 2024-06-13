import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			if(n < 12 || m < 4) {
				System.out.println(-1);
				continue;
			}

			System.out.println(m * 11 + 4);
		}
		
		sc.close();
    }
}