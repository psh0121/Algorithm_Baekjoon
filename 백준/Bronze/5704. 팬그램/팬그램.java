import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String result = "Y";

		while (true) {
			String str = sc.nextLine();
			if(str.equals("*")) break;

			result = "Y";

			for(int i = 0; i < alphabet.length(); i++) {
				if(!str.contains(Character.toString(alphabet.charAt(i)))) {
					result = "N";
					break;
				}
			}

			System.out.println(result);
		}

		sc.close();
    }
}
