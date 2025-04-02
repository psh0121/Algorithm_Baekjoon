import java.util.Scanner;

public class Main {
    public static int getGCD(int a, int b) {
        int result = 1;

        for(int i = 1; i <= Math.min(a, b); i++) {
            if(a % i == 0 && b % i == 0) result = i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a == 0 && b == 0) break;

            int gcd = getGCD(a, b); // 최대공약수
            long lcm = (long)a * b / gcd;   // 최소공배수

            System.out.println((lcm / a) * (lcm / b));
        }
        sc.close();
    }
}