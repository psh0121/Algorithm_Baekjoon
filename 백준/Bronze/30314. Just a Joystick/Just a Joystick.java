import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str1 = sc.next();
		String str2 = sc.next();

		int click = 0;

		for(int i = 0; i < n; i++) {
			int val1 = (int)(str1.charAt(i));
			int val2 = (int)(str2.charAt(i));

			int big = 0;
			int small = 0;

			if(val1 < val2) {
				big = val2;
				small = val1;
			}
			else if (val1 == val2) {
				continue;
			}
			else {
				big = val1;
				small = val2;
			}

			// 정방향 big - small
			int rightNum = big - small;

			// 역방향 (a부터 small) + (big부터 z)
			int reverseNum = (small - 65) + (90 - big) + 1;

			click += Math.min(rightNum, reverseNum);
		}

		System.out.println(click);
        sc.close();
    }
}
