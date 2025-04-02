import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        // 모든 경우의 수와 그 수의 개수를 파악하여 값을 넣는다
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                int sum = i + j;

                if(map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                }
                else {
                    map.put(sum, 1);
                }
            }
        }

        int maxCnt = 0;

        for(Integer key : map.keySet()) {
            maxCnt = Math.max(maxCnt, map.get(key));
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(Integer key : map.keySet()) {
            if(map.get(key) == maxCnt) list.add(key);
        }

        Collections.sort(list);

        list.forEach(el -> System.out.println(el));
        sc.close();
    }
}
