import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long before = 1;

		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			char op = sc.next().charAt(0);
			long b = sc.nextLong();

			long result = 0;

			if(op == '+') {
				result = (a + b) - before;
			}
			else if (op == '-') {
				result = (a - b) * before;
			}
			else if (op == '*') {
				result = (a * b) * (a * b);
			}
			else {
				if(a % 2 == 0) {
					result =  a / 2;
				}
				else {
					result = (a + 1) / 2;
				}
			}

			System.out.println(result);
			before = result;
		}
		sc.close(); 
    }
}
