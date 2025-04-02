import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int d = sc.nextInt();

		long sumXY = (1l * x * 100 + y) / 2;
		long w = (1l * sumXY + d) / 2;
		long h = (1l * sumXY - d) / 2;

		System.out.println(w / 100 + " " + w % 100);
		System.out.println(h / 100 + " " + h % 100);
		sc.close();
    }
}
