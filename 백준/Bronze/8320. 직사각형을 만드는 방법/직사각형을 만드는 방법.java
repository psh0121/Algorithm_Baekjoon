import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = n;

		for(int i = 2; i <= n; i++) {
			int j = i;

			while (true) {
				if(i * j <= n) {
					result++;
					j++;
				}
				else {
					break;
				}
			}
		}
		System.out.println(result);
		sc.close();
    }
}
