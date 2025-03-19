import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if(n == 0) break;

            int[] p1 = new int[n];
            int[] p2 = new int[n];

            for(int i = 0; i < n; i++) p1[i] = sc.nextInt();
            for(int i = 0; i < n; i++) p2[i] = sc.nextInt();

            int a = 0;
            int b = 0;

            for(int i = 0; i < n; i++) {
                int v1 = p1[i];
                int v2 = p2[i];

                if(Math.abs(v1 - v2) == 1) {
                    if(v1 == 1 && v2 == 2) a += 6;
                    else if(v1 == 2 && v2 == 1) b += 6;
                    else if(v1 > v2) b += v1+v2;
                    else if(v1 < v2) a += v1+v2;
                }
                else if(Math.abs(v1 - v2) > 1) {
                    if(v1 > v2) a += v1;
                    else if(v1 < v2) b += v2;
                }
            }

            System.out.println("A has " + a + " points. B has " + b + " points.");
            System.out.println();
        }
        sc.close();
    }
}