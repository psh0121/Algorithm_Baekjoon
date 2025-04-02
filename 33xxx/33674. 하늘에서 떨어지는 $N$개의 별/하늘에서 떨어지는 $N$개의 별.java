import java.util.Scanner;

public class Main {
    public static boolean isFalling (int n, int k, int[] cur, int[] star) {
        for(int i = 0; i < n; i++) {
            if(cur[i] + star[i] > k) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();

        int[] star = new int[n];
        for(int i = 0; i < n; i++) star[i] = sc.nextInt();

        int cnt = 0;
        int[] cur = new int[n]; // 현재 별 쌓인 개수

        while (d-- > 0) {
            if(!isFalling(n, k, cur, star)) {
                cnt++;
                for(int i = 0; i < n; i++) cur[i] = 0;
            }
            for(int i = 0; i < n; i++) {
                cur[i] += star[i];
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}