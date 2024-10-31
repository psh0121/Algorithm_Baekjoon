import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();

		HashMap<String, Integer> map1 = new HashMap<>();
		for(int i = 0; i < a.length(); i++) {
			String letter = Character.toString(a.charAt(i));

			if(!map1.containsKey(letter)) {
				map1.put(letter, 1);
			}
			else {
				map1.put(letter, map1.get(letter) + 1);
			}
		}

		HashMap<String, Integer> map2 = new HashMap<>();
		for(int i = 0; i < b.length(); i++) {
			String letter = Character.toString(b.charAt(i));

			if(!map2.containsKey(letter)) {
				map2.put(letter, 1);
			}
			else {
				map2.put(letter, map2.get(letter) + 1);
			}
		}

		HashMap<String, Integer> finMap = new HashMap<>();
		
		for(String key : map1.keySet()) {
			Integer value = map1.get(key);

			if(!finMap.containsKey(key)) finMap.put(key, value);
			else {
				finMap.put(key, Math.max(finMap.get(key), value));
			}
		}

		for(String key : map2.keySet()) {
			Integer value = map2.get(key);

			if(!finMap.containsKey(key)) finMap.put(key, value);
			else {
				finMap.put(key, Math.max(finMap.get(key), value));
			}
		}

		String result = "";

		for(String key : finMap.keySet()) {
			Integer value = finMap.get(key);

			result += key.repeat(value);
		}

		System.out.println(result);

        sc.close();
    }
}
