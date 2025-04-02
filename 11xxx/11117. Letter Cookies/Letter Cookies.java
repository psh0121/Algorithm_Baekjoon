import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String word = sc.next();
            Map<Character, Integer> wordMap = new HashMap<>();

            for(int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                wordMap.put(letter, wordMap.getOrDefault(letter, 0) + 1);
            }

            int n = sc.nextInt();

            while (n-- > 0) {
                String value = sc.next();
                Map<Character, Integer> valueMap = new HashMap<>();

                for(int i = 0; i < value.length(); i++) {
                    char letter = value.charAt(i);
                    valueMap.put(letter, valueMap.getOrDefault(letter, 0) + 1);
                }

                String result = "YES";

                for(Character key : valueMap.keySet()) {
                    if(!wordMap.containsKey(key)) {
                        result = "NO";
                        break;
                    }

                    if(valueMap.get(key) > wordMap.get(key)) {
                        result = "NO";
                        break;
                    }
                }

                System.out.println(result);
            }
        }
        sc.close();
    }
}