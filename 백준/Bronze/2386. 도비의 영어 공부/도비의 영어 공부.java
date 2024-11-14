import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			str = str.toLowerCase();

			if(str.length() == 1) break;

			char letter = str.charAt(0);
			int cnt = 0;

			for(int i = 2; i < str.length(); i++) {
				if(letter == str.charAt(i)) cnt++;
			}

			System.out.println(letter + " " + cnt);
		}
		sc.close();
    }
}
