import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int idx = 0;

        int study = 0;
        int time = 0;

        while (time < t) {
            if(time < arr[idx] - m) {
                study++;
                time++;
            }
            else if(time >= arr[idx] - m && time < arr[idx] + m) time++;
            else {
                idx++;

                if(idx == n) break;
            }
        }

        if(t - time > 0) study += (t - time);

        System.out.println(study);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
