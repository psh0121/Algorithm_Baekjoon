import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            String light = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int repeatCnt = y / light.length();
            if(y % light.length() != 0) repeatCnt++;

            String repeatLight = " " + light.repeat(repeatCnt);

            int blue = 0;

            for(int j = x; j <= y; j++) {
                char c = repeatLight.charAt(j);

                if(c == 'B') blue++;
            }

            System.out.println("Case #" + i + ": " + blue);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
