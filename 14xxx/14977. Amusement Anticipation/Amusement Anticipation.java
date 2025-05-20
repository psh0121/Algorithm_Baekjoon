import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            int idx = 1;
            
            if(n >= 2) {
                int d = arr[n-1] - arr[n-2];

                for(int i = n-1; i > 0; i--) {
                    if(arr[i] - arr[i-1] != d) {
                        idx = i+1;
                        break;
                    }
                }
            }

            System.out.println(idx);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
