import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int c = sc.nextInt();
            int n = sc.nextInt();
            int[] p = new int[n];

            boolean isBreak = false;

            for(int j = 0; j < n; j++) p[j] = sc.nextInt();

            for(int j = 0; j < n; j++) {
                for(int k = j+1; k < n; k++) {
                    if(p[j]+p[k] == c) {
                        System.out.println("Case #" + i + ": " + (j+1) + " " + (k+1));
                        isBreak = true;
                        break;
                    }

                }

                if(isBreak) break;
            }
        }
        sc.close();
    }
}