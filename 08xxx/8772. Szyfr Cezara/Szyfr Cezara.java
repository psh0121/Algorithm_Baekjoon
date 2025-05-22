import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();
            char c = sc.next().charAt(0);

            // k값 파악하기
            int k = 0;
            int strIdx0 = -1;

            for(int i = 0; i < alphabet.length(); i++) {
                if(str.charAt(0) == alphabet.charAt(i)) {
                    strIdx0 = i;
                    break;
                }
            }

            while (k <= 25) {
                if(alphabet.charAt((strIdx0 + k)%26) == c) break;
                k++;
            }

            // 결과값 출력
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < str.length(); i++) {
                int idx = -1;
                for(int j = 0; j < alphabet.length(); j++) {
                    if(str.charAt(i) == alphabet.charAt(j)) {
                        idx = j;
                        break;
                    }
                }

                idx = (idx + k)%26;

                sb.append(alphabet.charAt(idx));
            }

            System.out.println(sb.toString());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
