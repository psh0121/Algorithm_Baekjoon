import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int l = sc.nextInt();   // 전등의 개수
        int g = sc.nextInt();   // 불침번의 수
        int r = sc.nextInt();   // 순찰 횟수

        // 램프 상태
        boolean[] light = new boolean[l+1];

        // 불침번명단 : (이름, a d)
        Map<String, Integer[]> person = new HashMap<>();
        for(int i = 0; i < g; i++) {
            person.put(sc.next(), new Integer[]{sc.nextInt(), sc.nextInt()});
        }

        // 순찰 시작
        for(int i = 0; i < r; i++) {
            String name = sc.next();
            int a0 = person.get(name)[0];
            int d = person.get(name)[1];

            int k = 0;

            while (a0 + (k * d) <= l) {
                light[a0 + (k * d)] = !light[a0 + (k * d)];
                k++;
            }
        }

        int cnt = 0;

        for(int i = 1; i <= l; i++) {
            if(light[i]) cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}