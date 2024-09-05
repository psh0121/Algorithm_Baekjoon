import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int m1 = sc.nextInt();
		int y1 = sc.nextInt();
		int n = sc.nextInt();

		int d2 = sc.nextInt();
		int m2 = sc.nextInt();
		int y2 = sc.nextInt();

		int day1 = y1 * 360 + m1 * 30 + d1;
		int day2 = y2 * 360 + m2 * 30 + d2;
		int diffDay = day2 - day1;

		System.out.println((n + (diffDay % 7)) % 7 == 0 ? 7 : (n + (diffDay % 7)) % 7);
		sc.close();
    }
}
