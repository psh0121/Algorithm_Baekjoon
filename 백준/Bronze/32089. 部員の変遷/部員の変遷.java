import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int year = sc.nextInt();

			if(year == 0) break;

			int maxCnt = Integer.MIN_VALUE;

			int one = 0;
			int two = 0;
			int three = 0;

			for(int i = 0; i < year; i++) {
				three = sc.nextInt();

				maxCnt = Math.max(maxCnt, one + two + three);

				one = two;
				two = three;
			}

			System.out.println(maxCnt);
		}
		sc.close();
    }
}