import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String str = sc.next().toUpperCase();
        Map<Character,Integer> map = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // 가장 많이 나온 값 파악하기
        String maxCntAlpha = "";
        int maxCnt = 0;

        for(Character key : map.keySet()) {
            int value = map.get(key);

            if(value > maxCnt) {
                maxCntAlpha = Character.toString(key);
                maxCnt = value;
            }
            else if(value == maxCnt) {
                maxCntAlpha += Character.toString(key);
            }
        }

        System.out.println(maxCntAlpha.length() >= 2 ? "?" : maxCntAlpha);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
