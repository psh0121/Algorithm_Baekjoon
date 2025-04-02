import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int beforeH = sc.nextInt();
        int curH = 0;
        int curW = 0;

        int[] h = new int[n];
        int[] w = new int[n];

        for(int i = 0; i < n; i++) h[i] = sc.nextInt();
        for(int i = 0; i < n; i++) w[i] = sc.nextInt();

        double s = 0.0;

        for(int i = 0; i < n; i++) {
            curH = h[i];
            curW = w[i];

            s += (double)((beforeH + curH) * curW) / 2;

            beforeH = curH;
        }

        System.out.println(s);

        sc.close();
    }
}