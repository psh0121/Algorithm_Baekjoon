import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        boolean[] room = new boolean[n+1];

        for(int i = 0; i < n; i++) {
            int passport = sc.nextInt();

            if(passport > n) continue;

            room[passport] = true;
        }

        int cnt = 0;

        for(int i = 1; i < room.length; i++) {
            if(room[i]) cnt++;
        }

        System.out.println(cnt);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
