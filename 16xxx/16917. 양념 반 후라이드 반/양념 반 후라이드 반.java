import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int x = sc.nextInt();
		int y = sc.nextInt();

		// 양념, 후라이드로만
		int onlyAB = a * x + b * y;

		// 섞어서
		int mixC = c * Math.min(x, y) * 2;
		if(Math.min(x, y) == x) {
			mixC += (y-x) * b;
		}
		else {
			mixC += (x-y) * a;
		}

		// 반반으로만
		int onlyC = c * Math.max(x, y) * 2;

		System.out.println(onlyAB < mixC ? onlyAB : mixC < onlyC ? mixC : onlyC);
		sc.close();
    }
}
