import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int step = 0;

		while (a != b) {
			if (a > b) {
				a -= b;
			}
			else b -= a;

			step++;
		}

		System.out.println(step);
		sc.close();
    }
}
