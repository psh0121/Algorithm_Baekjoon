import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int a1 = sc.nextInt();

        int sn = a1;

        int[] aArr = new int[n+1];
        aArr[1] = a1;

        for(int i = 2; i <= n; i++) {
            int an = 0;

            if(i % 2 == 0) {
                an = p * aArr[i/2] + q;
            }
            else {
                an = r * aArr[(i-1)/2] + s;
            }

            aArr[i] = an;
            sn += an;
        }

        System.out.println(sn);
        sc.close();
    }
}
