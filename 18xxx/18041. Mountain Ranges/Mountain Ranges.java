import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int cnt = 1;
        int curCnt = 1;

        for(int i = 1; i < n; i++) {
            if(a[i] - a[i-1] <= x) {
                curCnt++;
            }
            else {
                cnt = Math.max(cnt, curCnt);
                curCnt = 1;
            }
        }

        cnt = Math.max(cnt, curCnt);

        System.out.println(cnt);
        sc.close();
    }
}