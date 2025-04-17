import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();

        if(n % 2 == 1) System.out.println(0);
        else {
            int calN = n/2;

            System.out.println((int)Math.pow(2, calN));
        }

        return;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}