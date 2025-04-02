import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;  // 시점을 정렬하기 위해 TreeMap을 사용

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
        
            // 시점에 해당하는 값들을 저장하는 TreeMap
            Map<Integer, Integer> map = new TreeMap<>();

            // 알파벳 켜지는 시점 map에 시점과 개수를 넣는다.
            for(int i = 0; i < n; i++) {
                char c = sc.next().charAt(0);
                int a = sc.nextInt();
                int b = sc.nextInt();

                // a부터 b-1까지 해당하는 구간에서 LED를 키기
                for(int j = a; j < b; j++) {
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            }

            // 시점에 따라 알파벳을 출력
            StringBuilder sb = new StringBuilder();
            for(int value : map.values()) {
                sb.append((char)(value + 64));  // value에 해당하는 알파벳을 출력
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }
}
