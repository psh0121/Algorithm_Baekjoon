import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static int solve(int n, int m, Scanner sc) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for(int i = 0; i < m; i++) {
            int ticket = sc.nextInt();
            map.put(ticket, map.get(ticket) + 1);
        }

        int cnt = 0;

        for(Integer value : map.values()) {
            if(value > 1) cnt++;
        }

        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n == 0 && m == 0) break;

            System.out.println(solve(n, m, sc));
        }
        sc.close();
    }
}