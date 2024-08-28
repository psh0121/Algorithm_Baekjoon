import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();

			int cnt = 0;

			for(int j = 0; j < a; j++) {
				for(int l = 0; l < b; l++) {
					int value = j & l;

					if(value < k) cnt++;
				}
			}

			System.out.println("Case #" + i + ": " + cnt);
		}
        sc.close();
    }
}
