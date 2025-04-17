import java.util.Scanner;

public class Main {
    public static int calSN (int n) {
        int result = 0;
        String strN = Integer.toString(n);

        for(int i = 0; i < strN.length(); i++) {
            int num = strN.charAt(i) - '0';

            result += num;
        }

        return result;
    }

    public static void solve (Scanner sc) {
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int sn = calSN(n);
            int p = 11;

            while (true) {
                if(sn == calSN(n*p)) {
                    System.out.println(p);
                    break;
                }

                p++;
            }
        }
        sc.close();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}