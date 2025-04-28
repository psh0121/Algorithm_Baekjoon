import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
       Map<Character, Integer> map = new LinkedHashMap<>();
       for(int i = 0; i < 26; i++) map.put((char)('a' + i), 0);
       for(int i = 0; i < 26; i++) map.put((char)('A' + i), 0);

       int t = sc.nextInt();
       sc.nextLine();

       while (t-- > 0) {
        String s = sc.nextLine();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' ') continue;

            map.put(c, map.get(c) + 1);
        }
       }

       for(char key : map.keySet()) {
        int value = map.get(key);

        if(value == 0) continue;

        System.out.println(key + " " + value);
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
