import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static boolean isContain (Map<Character, Character> map , char c) {
        boolean result = false;

        for(char key : map.keySet()) {
            char value = map.get(key);

            if(value == c) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static void solve (Scanner sc) {
        String w = sc.next();
        String s = sc.next();

        // 암호표 만들기
        Map<Character, Character> map = new HashMap<>();
        int alpha = 65;
        for(int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);

            if(!isContain(map, c)) {
                map.put((char)alpha++, c);
            }
        }

        int code = 65;

        for(int i = alpha; i <= 90; i++) {
            while (true) {
                if(!isContain(map, (char)code)) break;
                code++;
            }

            map.put((char)i, (char)code);
        }

        // 암호화하기
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            sb.append(map.get(s.charAt(i)));
        }

        System.out.println(sb.toString());
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}