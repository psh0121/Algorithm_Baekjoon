import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();

			int min = Math.max(0, a-b);
			int max = Math.min(n-b, a);

			System.out.println(min + " " + max);
		}
        sc.close();
    }
}
