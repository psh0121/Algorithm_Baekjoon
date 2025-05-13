import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int k = sc.nextInt();

        for(int tc = 1; tc <= k; tc++) {
            int c = sc.nextInt();   // 참가국 수
            int n = sc.nextInt();   // 개막식에 등장한 선수 수
        
            // 각 나라에 등록된 선수 수 입력
            Map<Integer, Integer> country = new HashMap<>();
            for(int i = 1; i <= c; i++) country.put(i, sc.nextInt());

            // 각 나라에 참가한 선수를 country의 value값에 -1한다
            for(int i = 0; i < n; i++) {
                int num = sc.nextInt();

                country.put(num, country.get(num) - 1);
            }

            // 가장 큰 value를 구한다
            int maxValue = 0;

            for(int key : country.keySet()) {
                maxValue = Math.max(maxValue, country.get(key));
            }

            System.out.println("Data Set " + tc + ":");
            System.out.println(maxValue);

            if(tc != k) System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

