import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 3; i <= n; i += 3) {
			for(int j = 3; j <= n; j += 3) {
				for(int k = 3; k <= n; k += 3) {
					if(i + j + k == n) {
						cnt++;
						break;
					}
				}
			}
		}

		System.out.println(cnt);
		sc.close();
    }
}
