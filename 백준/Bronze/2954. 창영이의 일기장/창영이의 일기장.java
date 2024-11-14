import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";

		for(int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			result += letter;

			if("aeiou".contains(Character.toString(letter))) {
				i += 2;
			}
		}

		System.out.println(result);
		sc.close();
    }
}
