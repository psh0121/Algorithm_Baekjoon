import java.util.Scanner;

public class Main {
    public static double[] solve(Scanner sc) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double)sum / n;
        
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if((double)arr[i] > avg) cnt++;
        }

        double cntAvg = (double)cnt / n * 100;

        // 반올림
        avg = Math.round(avg * 1000) / 1000.0;
        cntAvg = Math.round(cntAvg * 1000) / 1000.0;

        return new double[]{avg, cntAvg};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            double[] result = solve(sc);

            System.out.printf("%.3f %.3f%%\n", result[0], result[1]);
        }
        sc.close();
    }
}
