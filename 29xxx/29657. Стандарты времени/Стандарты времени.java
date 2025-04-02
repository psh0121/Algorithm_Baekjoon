import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int c1 = sc.nextInt();

		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int c2 = sc.nextInt();

		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();

		int sec = h * b1 * c1 + m * c1 + s;

		int resH = sec / (b2 * c2);
		sec %= (b2 * c2);

		int resM = sec / c2;
		sec %= c2;

		int resS = sec;

		System.out.println(resH + " " + resM + " " + resS);
		sc.close();
    }
}
