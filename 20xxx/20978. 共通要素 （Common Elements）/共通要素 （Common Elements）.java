import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();

        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        for(int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        Map<Integer, Integer> map = new HashMap<>();
        
        for(Integer value : a) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for(Integer value : b) {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        Set<Integer> set = new TreeSet<>();

        for(Integer key : map.keySet()) {
            if(map.get(key) >= 2) set.add(key);
        }

        for(Integer value : set) {
            System.out.println(value);
        }

        sc.close();
    }
}