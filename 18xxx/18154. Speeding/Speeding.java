import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxValue = 0;
        int beforeT = 0;
        int beforeD = 0;

        for(int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int d = sc.nextInt();

            if(i == 0) continue;

            int value = (d - beforeD) / (t - beforeT);
            beforeT = t;
            beforeD = d;

            maxValue = Math.max(maxValue, value);
        }

        System.out.println(maxValue);
        sc.close();
    }
}