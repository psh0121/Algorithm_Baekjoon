import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 암호의 첫 두자리를 이루는 숫자의 제곱과
		// 끝 두자리를 이루는 숫자의 제곱을 더한 값
		// 7로 나누었을 때 나머지가 1

		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			String abcd = sc.next();

			int a = Character.getNumericValue(abcd.charAt(0));
			int b = Character.getNumericValue(abcd.charAt(1));
			int c = Character.getNumericValue(abcd.charAt(2));
			int d = Character.getNumericValue(abcd.charAt(3));

			int ab = a * 10 + b;
			int cd = c * 10 + d;

			if((ab * ab + cd * cd) % 7 == 1) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
    }
}
