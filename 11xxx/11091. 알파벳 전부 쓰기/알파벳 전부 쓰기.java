import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		for(int i = 0; i < n; i++) {
			String str = sc.nextLine().toLowerCase();
			String result = "";

			for(int j = 0; j < alphabet.length(); j++) {
				if(!str.contains(Character.toString(alphabet.charAt(j)))) {
					result += alphabet.charAt(j);
				}
			}

			System.out.println(result.length() == 0 ? "pangram" : "missing " + result);
		}
		sc.close();
    }
}
