import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int key = sc.nextInt();

            if(map.containsKey(key)) map.put(key, map.get(key) + 1);
            else map.put(key, 1);
        }

        int maxCnt = 0;

        for(Integer key : map.keySet()) {
            int cnt = map.get(key);

            if(cnt > maxCnt) {
                maxCnt = cnt;
            }
        }

        System.out.println(maxCnt);
        sc.close();
    }
}
