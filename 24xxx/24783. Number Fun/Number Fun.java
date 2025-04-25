import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if(a < b) {
				int temp = a;
				a = b;
				b = temp;
			}

			if(a + b == c) {
				System.out.println("Possible");
			}
			else if(a - b == c) {
				System.out.println("Possible");
			}
			else if(a * b == c) {
				System.out.println("Possible");
			}
			else if((double)a / b == (double)c) {
				System.out.println("Possible");
			}
			else System.out.println("Impossible");
		}
		sc.close();
    }
}
