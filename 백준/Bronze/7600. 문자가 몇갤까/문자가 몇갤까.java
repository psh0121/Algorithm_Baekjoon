import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine().toLowerCase();
			if(str.equals("#")) break;

			String result = "";

			for(int i = 0; i < str.length(); i++) {
				int letterNum = (int)str.charAt(i);
				String letter = Character.toString(str.charAt(i));

				if(letterNum >= 97 && letterNum <= 122) {
					if(!result.contains(letter)) result += letter;
				}
			}

			System.out.println(result.length());
		}
		sc.close();
    }
}
