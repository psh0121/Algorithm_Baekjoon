import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double result = 0.0;

		for(int i = 0; i < n; i++) {
			int code = sc.nextInt();

			switch (code) {
				case 0:
					result += 2;
					break;
				case 1:
					result += 1;
					break;
				case 2:
					result += 0.5;
					break;
				case 4:
					result += 0.25;
					break;
				case 8:
					result += 0.125;
					break;
				default:
					result += 0.0625;
					break;
			}
		}


		System.out.println(result);
		sc.close();
    }
}