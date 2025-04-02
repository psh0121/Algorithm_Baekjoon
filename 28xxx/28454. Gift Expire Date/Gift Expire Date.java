import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.next().split("-");
		int curYear = Integer.parseInt(arr[0]);
		int curMonth = Integer.parseInt(arr[1]);
		int curDay = Integer.parseInt(arr[2]);

		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 0; i < n; i++) {
			String[] giftArr = sc.next().split("-");
			int year = Integer.parseInt(giftArr[0]);
			int month = Integer.parseInt(giftArr[1]);
			int day = Integer.parseInt(giftArr[2]);

			if(year < curYear) continue;
			else if(year == curYear) {
				if(month < curMonth) continue;
				else if(month == curMonth) {
					if(day < curDay) continue;
					else cnt++;
				}
				else cnt++;
			}
			else cnt++;
		}

		System.out.println(cnt);
		sc.close();
    }
}