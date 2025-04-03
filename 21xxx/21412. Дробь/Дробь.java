import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int maxA = 0;
        int maxB = 0;

        for(int i = 1; i < n; i++) {
            int a = i;
            int b = n-i;

            boolean isChange = false;

            // 진분수
            if(a >= b) break;

            // 기약분수
            for(int j = 2; j <= a; j++) {
                if(a % j == 0 && b % j == 0) {
                    isChange = true;
                    break;
                }
            }

            if(!isChange) {
                if(maxA == 0 && maxB == 0) {
                    maxA = a;
                    maxB = b;
                    continue;
                }

                if((double)a / b > (double)maxA/maxB) {
                    maxA = a;
                    maxB = b;
                }
            }
        }

        System.out.printf("%d %d\n", maxA, maxB);
        sc.close();
    }
}