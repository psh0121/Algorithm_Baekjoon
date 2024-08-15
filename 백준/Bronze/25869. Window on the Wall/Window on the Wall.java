import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int d = sc.nextInt();

		// 창문 설치 불가
		if(d * 2 >= w || d * 2 >= h) System.out.println(0);
		else {
			// 창문 면적 파악
			int windowWidth = w - 2 * d;
			int windowHeight = h - 2 * d;

			int windowS = windowWidth * windowHeight;

			System.out.println(windowS);
		}
		sc.close();
    }
}
