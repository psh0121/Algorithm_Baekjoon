import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int cnt = 0;

        while(n != 1) {
            int value = n / m;

            if(n % m != 0) {
                n = value + 1;
            }
            else n = value;

            cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}
