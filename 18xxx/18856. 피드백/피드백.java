import java.util.Scanner;

public class Main {

	public static int getPirmeNum(int beforeNum) {
		int result = beforeNum + 1;

		while (true) {
			boolean isPrime = true;

			if(result % 2 == 0) {
				result++;
				continue;
			}

			for(int i = 3; i <= Math.sqrt(result); i += 2) {
				if(result % i == 0) {
					isPrime = false;
					break;
				}
			}

			if(isPrime) break;
			else result++;
		}

		return result;
	}
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int beforeNum = 0;

		System.out.println(n);

		for(int i = 1; i <= n; i++) {
			if(i <= 2) {
				System.out.print(i + " ");
				beforeNum = i;
				continue;
			}

			int primeNum = getPirmeNum(beforeNum);
			beforeNum = primeNum;

			if(i == n) System.out.print(primeNum);
			else System.out.print(primeNum + " ");
		}
		sc.close();
    }
}