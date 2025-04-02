import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String str = sc.next();
			String result = "";

			for(int j = 0; j < str.length(); j++) {
				if(j == 0) {
					result += Character.toString(str.charAt(j)).toLowerCase();
					continue;
				}

				String letter = Character.toString(str.charAt(j));

				if(letter.equals(letter.toUpperCase())) {
					result += "_" + letter.toLowerCase();
				}
				else {
					result += letter;
				}

			}

			System.out.println(result);
		}
		sc.close();
    }
}
