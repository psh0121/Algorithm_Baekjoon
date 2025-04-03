import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();

        int r = 0;
        int s = 0;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < n; i++) {
            char l1 = s1.charAt(i);
            char l2 = s2.charAt(i);

            if(l1 == l2) {
                r++;
            }
            else {
                map1.put(l1, map1.getOrDefault(l1, 0) + 1);
                map2.put(l2, map2.getOrDefault(l2, 0) + 1);
            }
        }

        // s개 파악하기
        for(Character key : map2.keySet()) {
            if(map1.containsKey(key)) {
                s += Math.min(map1.get(key), map2.get(key));
            }
        }

        System.out.println(r + " " + s);
        sc.close();
    }
}
