import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 수박단계
		int k = sc.nextInt();	// 체리

		int cnt = k;

		for(int i = 2; i <= n; i++) {
			cnt /= 2;
		}

		System.out.println(cnt);
		sc.close();
    }
}