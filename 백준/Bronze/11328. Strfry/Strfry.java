import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			HashMap<String, Integer> map1 = new HashMap<>();
			HashMap<String, Integer> map2 = new HashMap<>();

			String str1 = sc.next();
			String str2 = sc.next();

			if(str1.length() != str2.length()) {
				System.out.println("Impossible");
				continue;
			}

			for(int j = 0; j < str1.length(); j++) {
				String letter = Character.toString(str1.charAt(j));

				if(!map1.containsKey(letter)) map1.put(letter, 1);
				else map1.put(letter, map1.get(letter) + 1);
			}

			for(int j = 0; j < str2.length(); j++) {
				String letter = Character.toString(str2.charAt(j));

				if(!map2.containsKey(letter)) map2.put(letter, 1);
				else map2.put(letter, map2.get(letter) + 1);
			}

			if(map1.size() != map2.size()) {
				System.out.println("Impossible");
				continue;
			}

			boolean isPossible = true;

			for(String key : map1.keySet()) {
				if(!map2.containsKey(key)) {
					isPossible = false;
					break;
				}

				if(map1.get(key) != map2.get(key)) {
					isPossible = false;
					break;
				}
			}

			System.out.println(isPossible ? "Possible" : "Impossible");
		}
		sc.close();
    }
}
