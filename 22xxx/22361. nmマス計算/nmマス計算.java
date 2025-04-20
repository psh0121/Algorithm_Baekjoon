import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void putMap(int num, Map<Character, Integer> map) {
        String strNum = Integer.toString(num);

        for(int i = 0; i < strNum.length(); i++) {
            char c = strNum.charAt(i);

            map.put(c, map.get(c) + 1);
        }
    }
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n == 0 && m == 0) break;

            int[] a = new int[n];
            int[] b = new int[m];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < m; i++) b[i] = sc.nextInt();

            Map<Character, Integer> map = new TreeMap<>();
            for(int i = 0; i < 10; i++) {
                char c = (""+i).charAt(0);
                map.put(c, 0);
            }

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    int calAB = a[i] * b[j];

                    putMap(calAB, map);
                }
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < 10; i++) {
                char c = (""+i).charAt(0);
                sb.append(map.get(c)).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}