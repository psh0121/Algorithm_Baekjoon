import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		long sum = 1;
		long before = 1;

		for(int i = 1; i <= b; i++) {
			before = before + (a - 2);
			sum += before;
		}

		System.out.println(sum);
		sc.close();
    }
}