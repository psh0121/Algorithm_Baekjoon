import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int halfLen = num.length() / 2;

		for(int i = 0; i < halfLen; i++) {
			System.out.print(num.charAt(i));
		}

		System.out.print(" ");

		for(int i = halfLen; i < num.length(); i++) {
			System.out.print(num.charAt(i));
		}
		sc.close();
    }
}
