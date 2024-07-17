import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cost = 0;

		for(int i = 0; i < n; i++) {
			int h = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();

			if(h < b) {
				cost += (b - h) * k;
			}
		}

		System.out.println(cost);
		sc.close();
    }
}
