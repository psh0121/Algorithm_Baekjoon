import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            String s = sc.next();
            String f = sc.next();
            int result = 0;

            for(int j = 0; j < s.length(); j++) {
                char x = s.charAt(j);
                int minValue = Integer.MAX_VALUE;

                for(int k = 0; k < f.length(); k++) {
                    char y = f.charAt(k);

                    int go = 0;     // 앞으로 구했을때
                    int back = 0;   // 뒤로 구했을때

                    if(x > y) {
                        go = ('z' - x) + (y - 'a') + 1;
                        back = x - y;
                    }
                    else if(x == y) {
                        go = 0;
                        back = 0;
                    }
                    else {
                        go = y - x;
                        back = (x - 'a') + ('z' - y) + 1;
                    }

                    minValue = Math.min(minValue, Math.min(go, back));

                    if(minValue == 0) break;
                }

                result += minValue;
            }

            System.out.println("Case #" + i + ": " + result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
