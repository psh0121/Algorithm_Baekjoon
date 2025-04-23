import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        String result = "No";
        boolean breakFlag = false;
        
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[j] - arr[i] != 3) continue;

                for(int k= j+1; k < n; k++) {
                    if(arr[k] - arr[j] != 3) continue;
                    else {
                        result = "Yes";
                        breakFlag = true;
                        break;
                    }
                }

                if(breakFlag) break;
            }

            if(breakFlag) break;
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}