import java.util.Scanner;

public class Main {
	public static boolean isPrime(int num) {
		boolean result = true;

		if(num == 1) return false;
		if(num == 2) return true;

		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				result = false;
				break;
			}
		}

		return result;
	}
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int sum = 0;
		int minValue = 0;

		for(int i = m; i <= n; i++) {
			if(isPrime(i)) {
				if(minValue == 0) minValue = i;
				sum += i;
			}
		}

		if(sum == 0 && minValue == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(minValue);
		}
		sc.close();
    }
}
