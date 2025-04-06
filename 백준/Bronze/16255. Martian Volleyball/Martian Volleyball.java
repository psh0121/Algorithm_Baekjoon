import java.util.Scanner;

public class Main {
    public static int solve(Scanner sc) {
        int k = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int cnt = 0;

        if(x < k && y < k) {
            if(x > y) {
                cnt = k - x;
                x = k;
            }
            else {
                cnt = k - y;
                y = k;
            }
        }

        int absXY = Math.abs(x - y);

        if(absXY == 0) cnt += 2;
        else if(absXY == 1) cnt++;

        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println(solve(sc));
        }
        sc.close();
    }
}