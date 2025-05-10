import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();

        // n! / (k! * (n-k)!) 계산한다
        int result = 1;

        int nPac = 1;
        int kPac = 1;
        int n_kPac = 1;

        for(int i = 1; i <= n; i++) nPac *= i;
        for(int i = 1; i <= k; i++) kPac *= i;
        for(int i = 1; i <= (n-k); i++) n_kPac *= i;

        result = nPac / (kPac * n_kPac);

        System.out.println(result);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
