import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			int result = 0;

			for(int j = 0; j < k; j++) {
				result = result * 2 + 1;
			}

			System.out.println(result);
		}
		sc.close();
    }
}
