import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        sc.nextLine();

        Map<Integer, Integer> map = new TreeMap<>();

        while (n-- > 0) {
            String[] arr = sc.nextLine().split(" ");

            int len = 0;

            for(int i = 0; i < arr.length; i++) {
                String s = arr[i];
                if(s.length() == 0) continue;

                len++;
            }

            map.put(len, map.getOrDefault(len, 0) + 1);
        }

        for(int key : map.keySet()) {
            int value = map.get(key);

            System.out.println(key + " " + value);
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
