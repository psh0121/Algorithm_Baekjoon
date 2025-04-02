import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int curH = 0;

		int cnt = 0;

		while (curH < h) {
			curH += a;
			cnt++;

			if(curH >= h) break;

			curH -= b;
		}

		System.out.println(cnt);
		sc.close();
    }
}
