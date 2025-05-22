import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            double d = sc.nextDouble();
            int n = sc.nextInt();

            if(d == 0.0 && n == 0) break;

            double[] x = new double[n];
            double[] y = new double[n];
            for(int i = 0; i < n; i++) {
                x[i] = sc.nextDouble();
                y[i] = sc.nextDouble();
            }

            boolean[] isSour = new boolean[n];

            for(int i = 0; i < n; i++) {
                for(int j = i+1; j < n; j++) {
                    double xCal = (x[j] - x[i]) * (x[j] - x[i]);
                    double yCal = (y[j] - y[i]) * (y[j] - y[i]);
                    double distance = Math.sqrt(xCal + yCal);

                    if(distance <= d) {
                        isSour[i] = true;
                        isSour[j] = true;
                    }
                }
            }

            int sour = 0;
            for(boolean b : isSour) if(b) sour++;
            int sweet = n - sour;

            System.out.println(sour + " sour, " + sweet + " sweet");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
