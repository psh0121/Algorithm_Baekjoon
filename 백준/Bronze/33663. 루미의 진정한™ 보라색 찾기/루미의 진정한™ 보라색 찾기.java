import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] h = {sc.nextInt(), sc.nextInt()};
        int[] s = {sc.nextInt(), sc.nextInt()};
        int[] v = {sc.nextInt(), sc.nextInt()};
        
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        int V = Math.max(r, Math.max(g, b));
        int m = Math.min(r, Math.min(g, b));
        double S = (double)255 * (double)(V - m) / V;

        double H = 0;

        if(V == r) {
            H = (double)60 * (g - b) / (V - m);
        }
        else if(V == g) {
            H = (double)120 + (double)60 * (b - r) / (V - m);
        }
        else {
            H = (double)240 + (double)60 * (r - g) / (V - m);
        }

        if(H < 0) H += 360.0;

        if(
            (H >= h[0] && H <= h[1]) &&
            (S >= s[0] && S <= s[1]) &&
            (V >= v[0] && V <= v[1])
        ) System.out.println("Lumi will like it.");
        else System.out.println("Lumi will not like it.");
        sc.close();
    }
}