import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int[] arr = new int[1001];
        
        int num = 1;
        int cnt = 0;
        for(int i = 1; i < arr.length; i++) {
            arr[i] = num;
            cnt++;

            if(num == cnt) {
                num++;
                cnt = 0;
            }
        }

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;

        for(int i = n; i <= m; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}