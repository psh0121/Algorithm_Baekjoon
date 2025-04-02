import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            Map<Integer, Integer> map = new HashMap<>();

            for(int i = 0; i < n; i++) {
                for(int j = 0; j < 6; j++) {
                    int num = sc.nextInt();
                    if(!map.containsKey(num)) map.put(num, 1);
                    else map.put(num, map.get(num)+1);
                }
            }

            if(map.size() < 49) System.out.println("No");
            else System.out.println("Yes");
        }
        sc.close();
    }
}
