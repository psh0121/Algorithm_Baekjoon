import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int q = sc.nextInt();
		int s = sc.nextInt();

		// 최소공배수 구하기
		int num = 0;

		for(int i = 1; i <= Math.min(p, q); i++) {
			if(p % i == 0 && q % i == 0) {
				num = i * (p/i) * (q/i);
			}
		}

		if(num <= s) System.out.println("yes");
		else System.out.println("no");
		sc.close();
    }
}
