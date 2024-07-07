import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str = sc.next();

		String result = "";

		for(int i = 0; i < a - 1; i++) {
			result += str.charAt(i);
		}

		for(int i = b-1; i >= a - 1; i--) {
			result += str.charAt(i);
		}

		for(int i = b; i < n; i++) {
			result += str.charAt(i);
		}

		System.out.println(result);
		
		sc.close();
    }
}