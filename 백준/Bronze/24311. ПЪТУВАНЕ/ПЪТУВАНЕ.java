import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		// 세미나 시작시간
		int t1 = sc.nextInt();
		int t2 = sc.nextInt();
		
		int seminarStartMinutes = t1 * 60 + t2 - 10;

		// 등록시간
		int t3 = sc.nextInt();

		// 이동시간
		int t4 = sc.nextInt();
		int t5 = sc.nextInt();
		int travelTimeMinutes = t4 * 60 + t5;

		int br = sc.nextInt();

		// 짐푸는데 소요시간
		int t6 = sc.nextInt();
		int unpackTimeMinutes = t6 * (br+1);

		int totalTimeMinutes = t3 + travelTimeMinutes + unpackTimeMinutes;
		int calTimeMinutes = seminarStartMinutes - totalTimeMinutes;

		int hh = calTimeMinutes / 60;
		int mm = calTimeMinutes % 60;

		System.out.printf("%02d %02d", hh, mm);

        sc.close();
    }
}
