import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String a = sc.next();
			String b = sc.next();

			String result = "YES";

			for(int j = 0; j < b.length(); j++) {
				char letter = b.charAt(j);

				if(!a.contains(Character.toString(letter))) {
					result = "NO";
					break;
				}
			}

			System.out.println(result);
		}
		sc.close();
    }
}
