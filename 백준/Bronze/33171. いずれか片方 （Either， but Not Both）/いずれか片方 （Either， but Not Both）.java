import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0; 

        for(int i = 1; i <= n; i++) {
            if(i % a == 0 && i % b == 0) continue;
            else if(i % a == 0 || i % b == 0)cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}