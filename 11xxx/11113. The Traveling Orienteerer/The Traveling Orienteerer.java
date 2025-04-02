import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        double[] x = new double[n];
        double[] y = new double[n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextDouble();
            y[i] = sc.nextDouble();
        }

        int m = sc.nextInt();

        while (m-- > 0) {
            int p = sc.nextInt();
            
            int aIdx = sc.nextInt();
            int bIdx = -1;

            double totalDistance = 0.0;

            for(int i = 1; i < p; i++) {
                bIdx = sc.nextInt();
                
                double distance = Math.sqrt((x[bIdx]-x[aIdx])*(x[bIdx]-x[aIdx]) + (y[bIdx]-y[aIdx])*(y[bIdx]-y[aIdx]));
                totalDistance += distance;

                aIdx = bIdx;
            }

            System.out.println(Math.round(totalDistance));
        }
        sc.close();
    }
}