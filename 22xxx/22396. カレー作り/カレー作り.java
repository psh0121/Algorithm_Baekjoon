import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int r0 = sc.nextInt();
			int w0 = sc.nextInt();
			int c = sc.nextInt();
			int r = sc.nextInt();

			if(r0 == 0 && w0 == 0 && c == 0 && r == 0) break;

			int curC = r0 / w0;
			int needR = 0;

			while (curC != c) {
				if(curC > c) break;
				else {
					needR ++;
					curC = (r0 + (needR * r)) / w0;
				}
			}

			System.out.println(needR);
		}
		sc.close();
    }
}
