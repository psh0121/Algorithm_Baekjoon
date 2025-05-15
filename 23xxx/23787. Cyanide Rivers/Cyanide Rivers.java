import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String s = sc.next();
        int maxZero = 0;
        int cnt = 0;

        // s부분에서 0이 가장 많이 반복되는 시점의 0의 개수를 구한다.
        // +1하고 /2 해서 일수를 파악한다
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '0') {
                cnt++;
                maxZero = Math.max(maxZero, cnt);
            }
            else cnt = 0;
        }

        System.out.println((maxZero + 1) / 2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
