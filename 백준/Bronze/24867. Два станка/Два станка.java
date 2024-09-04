import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();

		long a = sc.nextLong();
		long x = sc.nextLong();

		long b = sc.nextLong();
		long y = sc.nextLong();

		// case1 1 -> 2
		long time1 = k;
		long result1 = 0;

		time1 -= a;
		result1 += time1 * x;

		time1 -= b;
		result1 += time1 * y;

		// case2 2 -> 1
		long time2 = k;
		long result2 = 0;

		time2 -= b;
		result2 += time2 * y;

		time2 -= a;
		result2 += time2 * x;

		System.out.println(Math.max(result1, result2));
		sc.close();
    }
}
