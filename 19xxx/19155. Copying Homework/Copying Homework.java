import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<Integer, Integer> map = new HashMap<>();

        int j = n;
        for(int i = 1; i <= n; i++) {
            map.put(i, j--);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            sb.append(map.get(num) + " ");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}