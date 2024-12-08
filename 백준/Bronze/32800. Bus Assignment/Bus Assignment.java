import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int maxNum = 0;
		int curNum = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			curNum -= a;
			curNum += b;

			maxNum = Math.max(maxNum, curNum);
		}

		System.out.println(maxNum);
		sc.close();
    }
}
