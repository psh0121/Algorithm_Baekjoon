import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int[] p = new int[20];
            for(int i = 0; i < 20; i++) p[i] = sc.nextInt();

            for(int i = 19; i > 0; i--) {
                int cur = p[i];
                if(cur % 2 == 0) {
                    p[i] = 0;
                    p[i-1] = p[i-1] + (cur/2);
                }
                else {
                    p[i] = 1;
                    p[i-1] = p[i-1] + (cur/2);
                }
            }

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < 20; i++) {
                sb.append(p[i]).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
