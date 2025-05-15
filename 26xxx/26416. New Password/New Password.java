import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int tc = 1; tc <= t; tc++) {
            int len = sc.nextInt();
            String password = sc.next();

            boolean containBigAlphabet = false;
            boolean containSmallAlphabet = false;
            boolean containNumber = false;
            boolean containSpecialChar = false;

            // 조건 파악
            for(int i = 0; i < len; i++) {
                char c = password.charAt(i);

                if(c >= 'A' && c <= 'Z') containBigAlphabet = true;
                else if(c >= 'a' && c <= 'z') containSmallAlphabet = true;
                else if(c >= '0' && c <= '9') containNumber = true;
                else containSpecialChar = true;
            }

            String newPassword = password;

            if(!containBigAlphabet) newPassword += "A";
            if(!containSmallAlphabet) newPassword += "a";
            if(!containNumber) newPassword += "0";
            if(!containSpecialChar) newPassword += "@";
            if(newPassword.length() < 7) newPassword += "1".repeat(7 - newPassword.length());

            System.out.println("Case #" + tc + ": " + newPassword);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
