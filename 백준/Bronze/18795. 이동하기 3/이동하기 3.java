import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long result = 0;

        for(int i = 0; i < n + m; i++) {
            result += sc.nextLong();
        }

        System.out.println(result);
        sc.close();
    }
}
