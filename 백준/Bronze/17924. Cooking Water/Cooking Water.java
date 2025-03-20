import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= 1000; i++) {
            map.put(i, 0);
        }
        
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j = a; j <= b; j++) {
                map.put(j, map.get(j)+1);
            }
        }

        boolean isValueN = false;

        for(Integer value : map.values()) {
            if(value == n) {
                isValueN = true;
                break;
            }
        }

        System.out.println(!isValueN ? "edward is right" : "gunilla has a point");
        sc.close();
    }
}