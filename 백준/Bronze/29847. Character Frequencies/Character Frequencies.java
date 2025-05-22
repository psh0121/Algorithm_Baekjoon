import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void solve (Scanner sc) {
        int n = Integer.parseInt(sc.nextLine());
        Map<Character, Integer> map = new TreeMap<>();

        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();

            for(char c : str.toCharArray()) {
                if(c == ' ') continue;
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
