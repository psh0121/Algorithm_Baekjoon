import java.math.BigInteger;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;
            sc.nextLine();
            sc.nextLine();

            BigInteger factNum = BigInteger.valueOf(1);

            for(int i = 1; i <= n; i++) {
                BigInteger bigI = BigInteger.valueOf(i);

                factNum = factNum.multiply(bigI);
            }

            String facNumStr = factNum.toString();

            Map<Integer, Integer> map = new TreeMap<>();
            for(int i = 0; i <= 9; i++) {
                map.put(i, 0);
            }

            // 팩토리얼계산한 값 숫자개수 파악하기
            for(int i = 0; i < facNumStr.length(); i++) {
                int num = facNumStr.charAt(i) - '0';

                map.put(num, map.get(num) + 1);
            }

            StringBuilder sb = new StringBuilder();
            sb.append(n).append("! --\n");
            sb.append(" ".repeat(3));

            // 0~4 출력
            for(int i = 0; i <= 4; i++) {
                sb.append("(").append(i).append(")");

                String value = Integer.toString(map.get(i));

                sb.append(" ".repeat(5-value.length())).append(value);

                if(i == 4) sb.append("\n");
                else sb.append(" ".repeat(4));
            }

            sb.append(" ".repeat(3));

            // 5~9 출력
            for(int i = 5; i <= 9; i++) {
                sb.append("(").append(i).append(")");

                String value = Integer.toString(map.get(i));

                sb.append(" ".repeat(5-value.length())).append(value);

                if(i == 4) sb.append("\n");
                else sb.append(" ".repeat(4));
            }

            System.out.println(sb.toString().trim());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}