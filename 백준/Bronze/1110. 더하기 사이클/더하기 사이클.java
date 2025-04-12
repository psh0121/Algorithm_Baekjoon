import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int copyN = n;
        int newNum = -1;
        int cnt = 0;

        while (copyN != newNum) {
            if(cnt != 0) n = newNum;

            newNum = (n/10) + (n%10);
            newNum = ((n%10) * 10) + (newNum%10);

            cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}