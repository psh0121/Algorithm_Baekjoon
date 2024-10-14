import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		// 분모
		int down = a * e - b * d;

		// 분자
		int upX = c * e - b * f;
		int upY = a * f - c * d;

		int x = 0;
		int y = 0;

		if(down == 0) {
			x = 0;
			y = 0;
		}
		else {
			x = upX / down;
			y = upY / down;
		}

		System.out.println(x + " " + y);
		sc.close();
    }
}
