import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int m = sc.nextInt();
			String type = sc.next();
			StringBuilder result = new StringBuilder();

			if(type.equals("C")) {
				for(int j = 0; j < m; j++) {
					String letter = sc.next();
					result.append((int)letter.charAt(0) - 64);
					result.append(" ");
				}
			}
			else {
				for(int j = 0; j < m; j++) {
					int num = sc.nextInt();
					result.append((char)(num + 64));
					result.append(" ");
				}
			}

			System.out.println(result.toString().trim());
		}
		sc.close();
    }
}
