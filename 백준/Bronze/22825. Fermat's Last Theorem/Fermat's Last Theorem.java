import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            long z = sc.nextLong();
            if(z == 0) break;

            long z3 = z * z * z;

            long maxX3Y3Sum = 0;

            for(int x = 1; x <= z; x++) {
                long x3 = x * x * x;

                if(x3 > z3) continue;

                for(int y = 1; y <= z; y++) {
                    long y3 = y * y * y;

                    if(x3 + y3 > z3) continue;

                    maxX3Y3Sum = Math.max(maxX3Y3Sum, x3 + y3);
                }
            }

            System.out.println(z3 - maxX3Y3Sum);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
