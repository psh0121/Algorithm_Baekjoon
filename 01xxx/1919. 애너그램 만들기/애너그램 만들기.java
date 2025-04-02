import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<Character, Integer> str1 = new HashMap<>();
		Map<Character, Integer> str2 = new HashMap<>();

		String s1 = sc.next();
		String s2 = sc.next();

		for(int i = 0; i < s1.length(); i++) {
			str1.put(s1.charAt(i), str1.getOrDefault(s1.charAt(i), 0) + 1);
		}

		for(int i = 0; i < s2.length(); i++) {
			str2.put(s2.charAt(i), str2.getOrDefault(s2.charAt(i), 0) + 1);
		}

		int cnt = 0;

		for(Map.Entry<Character, Integer> entry : str1.entrySet()) {
			if (!str2.containsKey(entry.getKey())) {
				cnt += entry.getValue();
			}
			else if (entry.getValue() != str2.get(entry.getKey())) {
				cnt += Math.abs(entry.getValue() - str2.get(entry.getKey()));
			}
		}

		for(Map.Entry<Character, Integer> entry : str2.entrySet()) {
			if(!str1.containsKey(entry.getKey())) {
				cnt += entry.getValue();
			}
		}

		System.out.println(cnt);
		sc.close();
    }
}
