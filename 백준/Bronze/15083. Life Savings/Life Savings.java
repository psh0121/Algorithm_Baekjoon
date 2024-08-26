import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
		int p2 = sc.nextInt();
		int p3 = sc.nextInt();
		int c1 = sc.nextInt();
		int c2 = sc.nextInt();
		int c3 = sc.nextInt();

		int sumValue = p1 + p2 + p3;
		double price1 = sumValue * (double)(100-c1) / 100;

		int[] pArr = {p1, p2, p3};
		int[] cArr = {c2, c3};
		Arrays.sort(pArr);
		Arrays.sort(cArr);

		double price2 = pArr[0] + (pArr[1] * (double)(100-cArr[0]) / 100) + (pArr[2] * (double)(100-cArr[1]) / 100);

		if(price1 < price2) {
			System.out.printf("%s %.2f", "one", sumValue - price1);
		}
		else {
			System.out.printf("%s %.2f", "two", sumValue - price2);
		}
        sc.close();
    }
}
