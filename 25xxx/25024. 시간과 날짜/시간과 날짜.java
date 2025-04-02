import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 시간
		// 0~23
		// 0~59

		// 달력
		// 1, 3, 5, 7, 8, 10, 12 - 31
		// 4, 6, 9, 11 - 30
		// 2 - 29

		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			// time
			String time = (x >= 0 && x <= 23 && y >= 0 && y <= 59) ? "Yes" : "No";

			// day
			String day = "";
			if (x >= 1 && x <= 12) {
				if((x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12) && y >= 1 && y <= 31) {
					day = "Yes";
				}
				else if ((x == 4 || x == 6 || x == 9 || x == 11) && y >= 1 && y <= 30) {
					day = "Yes";
				}
				else if (x == 2 && y >= 1 && y <= 29) {
					day = "Yes";
				}
				else day = "No";
			}
			else day = "No";

			System.out.printf("%s %s\n", time, day);
		}

		sc.close();
    }
}