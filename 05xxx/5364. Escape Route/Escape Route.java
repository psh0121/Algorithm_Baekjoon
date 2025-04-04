import java.util.Scanner;

public class Main {
    public static double solve(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt((x1-x2) * (x1-x2) + (y1-y2) * (y1-y2));
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        

        int x1 = x[0];
        int y1 = y[0];
        int x2 = 0;
        int y2 = 0;

        double dist = Double.MAX_VALUE;

        for(int i = 1; i < n; i++) {
            if(solve(x1, y1, x[i], y[i]) < dist) {
                x2 = x[i];
                y2 = y[i];

                dist = solve(x1, y1, x[i], y[i]);
            }
        }

        System.out.println(x1 + " " + y1);
        System.out.println(x2 + " " + y2);
        System.out.printf("%.2f\n", dist);
        sc.close();
    }
}