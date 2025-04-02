import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();

            if(Math.abs(p1 - p2) > x) {
                int p3 = sc.nextInt();
                sum += p3;
            }
            else {
                sum += p1 > p2 ? p1 : p2;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
