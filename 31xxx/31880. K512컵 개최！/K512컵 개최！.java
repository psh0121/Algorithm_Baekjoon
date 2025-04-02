import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        long result = 0;
        for(int i = 0; i < n; i++) result += sc.nextLong();
        for(int i = 0; i < m; i++) {
          long num = sc.nextLong();
          if(num != 0) result *= num;
        }

        System.out.println(result);
        sc.close();
    }
}