import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long sumNum = (n * (n + 1)) / 2;

		for(int i = 0; i < n - 1; i++) {
			sumNum -= sc.nextLong();
		}

		System.out.println(sumNum);
		sc.close();
    }
}