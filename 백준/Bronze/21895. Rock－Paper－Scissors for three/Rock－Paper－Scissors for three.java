import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        
        String one = sc.next();
        String two = sc.next();
        String three = "";

        for(int i = 0; i < n; i++) {
            int r = 0;
            int s = 0;
            int p = 0;

            char oneValue = one.charAt(i);
            char twoValue = two.charAt(i);

            if(oneValue == 'R') r++;
            else if(oneValue == 'S') s++;
            else p++;

            if(twoValue == 'R') r++;
            else if(twoValue == 'S') s++;
            else p++;

            // 최고의 선택
            if(r == 2) three += "P";
            else if(s == 2) three += "R";
            else if(p == 2) three += "S";
            else if(r == 1 && s == 1) three += "R";
            else if(r == 1 && p == 1) three += "P";
            else if(s == 1 && p == 1) three += "S";
            else three += "R";  // 예외처리
        }

        System.out.println(three);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

