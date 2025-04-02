import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int minY = Integer.MAX_VALUE;
		int maxY = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			if(y < minY) minY = y;
			if(y > maxY) maxY = y;
		}

		System.out.println(Math.abs(maxY - minY));
		sc.close();
    }
}