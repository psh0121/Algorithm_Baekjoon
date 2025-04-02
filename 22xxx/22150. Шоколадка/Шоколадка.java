import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String result = "no";

			for(int j = 0; j < n; j++) {
				int l = sc.nextInt();
				int r = sc.nextInt();

				if(l + r != n) {
					result = "yes";
				}
			}

			System.out.println(result);
		}
        sc.close();
    }
}
