import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 한살미만 1개월 - 15개월
		// 2살미만 1개월 - 9개월
		// 2살이상 1개월 - 4개월
		// 1년 - 15년
		// 2년 - 9년
		// 3년~ - 4년

		int y = sc.nextInt();
		int m = sc.nextInt();

		int hY = 0;
		int hM = 0;

		if(y == 0) {
			hM = m * 15;
		}
		else if(y == 1) {
			hY = 15;
			hM = m * 9;
		}
		else {
			if(y == 2) {
				hY = 15 + 9;
				hM = m * 4;
			}
			else {
				hY = 15 + 9 + ((y-2) * 4);
				hM = m * 4;
			}
		}

		hY += hM/12;
		hM %= 12;

		System.out.println(hY + " " + hM);

		sc.close();
    }
}
