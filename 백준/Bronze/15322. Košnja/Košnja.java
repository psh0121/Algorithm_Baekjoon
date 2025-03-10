import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(Math.min(n, m) + Math.min(n, m) - 2);
        }
        sc.close();
    }
}