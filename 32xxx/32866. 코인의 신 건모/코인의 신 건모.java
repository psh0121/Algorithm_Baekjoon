import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x = sc.nextDouble();

		// 현재 금액
		double curMoney = n * ((100-x) / 100.0);

		// 원금 복구하려면 몇 % 올라야 하는가
		double result = (n / curMoney - 1) * 100;

		System.out.printf("%.6f", result);
		sc.close();
    }
}
