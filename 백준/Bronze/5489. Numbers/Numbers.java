import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();    // 숫자, 개수

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // map에서 가장 큰값을 파악한다
        int maxCnt = 0;
        for(Integer value : map.values()) maxCnt = Math.max(maxCnt, value);

        // maxCnt를 가진 value중에서 가장 작은 key값을 구한다
        int minX = Integer.MAX_VALUE;
        for(Integer key : map.keySet()) {
            int cnt = map.get(key);

            if(maxCnt == cnt) {
                minX = Math.min(minX, key);
            }
        }

        System.out.println(minX);
        sc.close();
    }
}