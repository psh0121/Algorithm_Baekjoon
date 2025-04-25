import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int minNum = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(Integer key : map.keySet()) {
            if(map.get(key) < minValue) {
                minValue = map.get(key);
                minNum = key;
            }
            else if(map.get(key) == minValue) {
                minNum = Math.min(minNum, key);
            }
        }

        System.out.println(minNum);
        sc.close();
    }
}