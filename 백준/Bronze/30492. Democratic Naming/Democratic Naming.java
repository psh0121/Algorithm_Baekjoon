import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();   // 단어 개수
        int m = sc.nextInt();   // 단어 길이
        String[] arr = new String[n]; 
        for(int i = 0; i < n; i++) arr[i] = sc.next();

        String result = "";

        for(int idx = 0; idx < m; idx++) {
            Map<Character, Integer> map = new TreeMap<>();

            for(int i = 0; i < n; i++) {
                char c = arr[i].charAt(idx);

                if(map.containsKey(c)) map.put(c, map.get(c) + 1);
                else map.put(c, 1);
            }

            // 가장 많은 수량
            int maxCnt = 0;
            for(char key : map.keySet()) {
                maxCnt = Math.max(maxCnt, map.get(key));
            }

            // 가장 많은 수량인 알파벳 구하기
            ArrayList<Character> list = new ArrayList<>();
            for(char key : map.keySet()) {
                if(map.get(key) == maxCnt) list.add(key);
            }

            // 값 붙이기
            result += list.get(0);
        }

        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

