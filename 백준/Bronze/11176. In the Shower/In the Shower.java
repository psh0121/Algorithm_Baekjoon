import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int e = sc.nextInt();
			int n = sc.nextInt();

			int cnt = 0;

			for(int j = 0; j < n; j++) {
				int bottle = sc.nextInt();

				if(bottle > e) cnt++;
			}

			System.out.println(cnt);
		}
		sc.close();
    }
}
