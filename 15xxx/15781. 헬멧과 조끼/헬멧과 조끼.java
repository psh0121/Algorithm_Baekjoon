import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int maxHead = Integer.MIN_VALUE;
		int maxBody = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++) {
			maxHead = Math.max(maxHead, sc.nextInt());
		}

		for(int i = 0; i < m; i++) {
			maxBody = Math.max(maxBody, sc.nextInt());
		}

		System.out.println(maxHead + maxBody);
    	sc.close();
    }
}