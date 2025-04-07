import java.util.Scanner;

public class Main {
    public static int solve(int n, Scanner sc) {
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int cnt = 0;
        boolean trueFlag = true;

        for(int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]) {
                trueFlag = false;
                break;
            }
        }

        if(trueFlag) return cnt;

        while (true) {
            int[] newArr = new int[n];
            cnt++;

            if(cnt == 1001) return -1;

            for(int i = 0; i < n; i++) {
                if(i == n-1) newArr[i] = Math.abs(arr[i] - arr[0]);
                else newArr[i] = Math.abs(arr[i] - arr[i+1]);
            }

            boolean isSame = true;
            int num = newArr[0];

            for(int i = 0; i < newArr.length; i++) {
                if(num != newArr[i]) {
                    isSame = false;
                    break;
                }
            }

            arr = newArr;

            if(isSame) break;
        }

        return cnt;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = 1;

        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int result = solve(n, sc);
            if(result == -1) {
                System.out.println("Case " + t++ + ": not attained");
            } else {
                System.out.println("Case " + t++ + ": " + result + " iterations");
            }
        }
        sc.close();
    }
}
