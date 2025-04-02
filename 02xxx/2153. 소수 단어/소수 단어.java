import java.util.Scanner;

public class Main {
	public static boolean isPrime(int num) {
		boolean result = true;

		if(num > 2) {
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					result = false;
					break;
				}
			}
		}

		return result;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);

			// 소문자인가?
			if(letter == Character.toLowerCase(letter)) sum += ((int)letter - 96);

			// 대문자인가?
			else sum += ((int)letter - 38);
		}

		System.out.println(isPrime(sum) ? "It is a prime word." : "It is not a prime word.");
		sc.close();
    }
}
