import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for(int i = 1; i <= n; i++) map.put(i, i);

        while (m-- > 0) {
            int ball = sc.nextInt();
            int move = sc.nextInt();

            map.put(ball, move);
        }

        for(Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }
        sc.close();
    }
}