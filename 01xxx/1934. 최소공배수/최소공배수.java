import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int result  = 1;

            int divideNum = 2;

            while (divideNum <= Math.min(a, b)) {
                if(a % divideNum == 0 && b % divideNum == 0) {
                    result *= divideNum;
                    
                    a /= divideNum;
                    b /= divideNum;
                    
                    divideNum = 2;
                }
                else divideNum++;
            }

            result *= a;
            result *= b;

            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}