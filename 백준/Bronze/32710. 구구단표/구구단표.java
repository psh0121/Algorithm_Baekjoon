import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n <= 9) {
			System.out.println(1);
			return;
		}

		for(int i = 2; i <= 9; i++) {
			if(n % i == 0 && n / i <= 9) {
				System.out.println(1);
				return;
			}
		}

		System.out.println(0);
		sc.close();
    }
}
