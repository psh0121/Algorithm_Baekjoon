import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			if(h1 == 0 && m1 == 0 && h2 == 0 && m2 == 0) break;

			int time1 = h1 * 60 + m1;
			int time2 = h2 * 60 + m2;

			if(time1 > time2) time2 += 1440;

			System.out.println(time2 - time1);
		}
        sc.close();
    }
}
