import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {
			String str = sc.nextLine();
			HashMap<String, Integer> map = new HashMap<>();

			for(int j = 0; j < str.length(); j++) {
				String letter = Character.toString(str.charAt(j));
				if(letter.equals(" ")) continue;

				if(!map.containsKey(letter)) map.put(letter, 1);
				else map.put(letter, map.get(letter) + 1);
			}

			String maxLetter = "";
			int maxCnt = 0;

			for(String letter : map.keySet()) {
				Integer cnt = map.get(letter);

				if(maxCnt == cnt) maxLetter += letter;
				else if(maxCnt < cnt) {
					maxLetter = letter;
					maxCnt = cnt;
				}
			}

			if(maxLetter.length() > 1) System.out.println("?");
			else System.out.println(maxLetter);
		}
		sc.close();
    }
}
