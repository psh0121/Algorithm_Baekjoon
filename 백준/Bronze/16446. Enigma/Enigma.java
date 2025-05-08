import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String code = sc.next();
        String s = sc.next();

        int cnt = 0;

        for(int i = 0; i <= code.length() - s.length(); i++) {
            String strCode = code.substring(i, i+s.length());
            boolean isOK = true;

            for(int j = 0; j < s.length(); j++) {
                if(strCode.charAt(j) == s.charAt(j)) {
                    isOK = false;
                    break;
                }
            }

            if(isOK) cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
