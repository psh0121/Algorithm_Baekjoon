import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= m; i++) map.put(i, 0);

        // fill the map
        for(int i = 0; i < n; i++) {
            int num = arr[i];

            map.put(num, map.get(num) + 1);
        }

        int maxNum = 0;

        for(Integer value : map.values()) {
            maxNum = Math.max(maxNum, value);
        }

        System.out.println(maxNum);
        sc.close();
    }
}