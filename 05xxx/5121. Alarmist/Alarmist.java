import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int minValue = Integer.MAX_VALUE;
            int maxValue = 0;

            int[] arr = new int[n];
            for(int j = 0; j < n; j++) arr[j] = sc.nextInt();

            for(int j = w-1; j < n; j++) {
                int sum = 0;

                for(int k = j-(w-1); k <= j; k++) {
                    sum += arr[k];
                }

                int avg = (int)Math.floor((double)sum / w);

                minValue = Math.min(minValue, avg);
                maxValue = Math.max(maxValue, avg);
            }

            System.out.println("Data Set " + i + ":");
            System.out.println(maxValue - minValue);
            if(i != t) System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}

