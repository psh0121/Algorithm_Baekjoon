import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>();

		while (sc.hasNext()) {
			String str = sc.nextLine();

			for(int i = 0; i < str.length(); i++) {
				String letter = Character.toString(str.charAt(i));
				if(letter.equals(" ")) continue;

				if(!map.containsKey(letter)) map.put(letter, 1);
				else map.put(letter, map.get(letter) + 1);
			}
		}

		int maxCnt = Integer.MIN_VALUE;
		for(String key : map.keySet()) {
			if(map.get(key) > maxCnt) {
				maxCnt = map.get(key);
			}
		}

		String value = "";
		for(String key : map.keySet()) {
			if(map.get(key) == maxCnt) {
				value += key;
			}
		}

		String[] arr = value.split("");
		Arrays.sort(arr);

		System.out.println(String.join("", arr));
		sc.close();
    }
}
