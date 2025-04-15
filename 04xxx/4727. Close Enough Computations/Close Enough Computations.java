import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            int kcal = sc.nextInt();
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            if(kcal == 0 && a == 0 && b == 0 && c == 0) break;

            String result = "no";
            boolean isBreak = false;

            for(double i = -0.5; i < 0.5; i += 0.01) {
                for(double j = -0.5; j < 0.5; j += 0.01) {
                    for(double k = -0.5; k < 0.5; k += 0.01) {
                        double cal = (a+i < 0 ? 0 : a+i)*9 + (b+j < 0 ? 0 : b+j)*4 + (c+k < 0 ? 0 : c+k)*4;

                        if(kcal == Math.round(cal)) {
                            result = "yes";
                            isBreak = true;
                            break;
                        }
                    }

                    if(isBreak) break;
                }
                if(isBreak) break;
            }

            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}