import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			String s = sc.next();
			StringBuilder result = new StringBuilder();

			for(int j = 0; j < s.length(); j++) {
				char letter = s.charAt(j);
				int value = (a * ((int)letter - 65) + b) % 26;
				result.append((char)(value + 65));
			}

			System.out.println(result.toString());
		}
		sc.close();
    }
}
