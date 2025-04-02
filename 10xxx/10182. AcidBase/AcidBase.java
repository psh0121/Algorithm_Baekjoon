import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String name = sc.next();
            sc.next();
            double value = sc.nextDouble();

            double result = 0.0;

            if(name.equals("H")) {
                result = -Math.log10(value);
            }
            else {
                double oh = -Math.log10(value);
                result = (double)14 - oh;
            }

            System.out.printf("%.2f\n", result);
        }
        sc.close();
    }
}
