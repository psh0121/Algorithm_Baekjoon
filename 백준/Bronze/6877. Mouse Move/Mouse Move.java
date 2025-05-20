import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int c = sc.nextInt();
        int r = sc.nextInt();

        int curX = 0;
        int curY = 0;

        while (true) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(x == 0 && y == 0) break;

            curX += x;
            curY += y;

            if(curX > c) curX = c;
            else if(curX < 0) curX = 0;
            
            if(curY > r) curY = r;
            else if(curY < 0) curY = 0;

            System.out.println(curX + " " + curY);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
